package water.fvec;

import org.junit.Assert;
import org.junit.Test;
import water.TestUtil;

import java.util.Arrays;

public class C0DChunkTest extends TestUtil {
  @Test
  public void test_inflate_impl() {
    final int K = 1<<16;
    for (Double d : new Double[]{3.14159265358, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.MAX_VALUE, Double.NaN}) {
      NewChunk nc = new NewChunk(null, 0);
      for (int i=0;i<K;++i) nc.addNum(d);
      Assert.assertEquals(K, nc.len());

      Chunk cc = nc.compress();
      Assert.assertEquals(K, cc.len());
      Assert.assertTrue(cc instanceof C0DChunk);
      for (int i=0;i<K;++i) Assert.assertEquals(d, cc.at0(i), 0);

      Chunk cc2 = cc.inflate_impl(new NewChunk(null, 0)).compress();
      Assert.assertEquals(K, cc2.len());
      Assert.assertTrue(cc2 instanceof C0DChunk);
      for (int i=0;i<K;++i) Assert.assertEquals(d, cc2.at0(i), 0);

      Assert.assertTrue(Arrays.equals(cc._mem, cc2._mem));
    }
  }
}
