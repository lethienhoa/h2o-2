package water.api;

import water.util.Check;

public class Constants {
  public static class Suffixes {
    // JSON fields with these suffixes will automatically provide some
    // pretty printing.  Users can still override the fields later
    public static final String BYTES               = "_bytes";
    public static final String BYTES_PER_SECOND    = "_bytes_/_sec";
    public static final String MILLIS              = "_ms";
  }

  public static class Extensions {
    public static final String HEX = ".hex";
    public static final String JOB = ".job";
    public static final String KMEANS = ".kmeans";
    public static final String R = ".r";
  }

  public static final String BUILT_IN_KEY_JOBS                 = "jobs";

  public static final String ALPHA                 = "alpha";
  public static final String ARGUMENTS             = "arguments";
  public static final String AUC                   = "area_under_curve";
  public static final String BASE                  = "base";
  public static final String BEST_THRESHOLD        = "best_threshold";
  public static final String BETA_EPS              = "beta_epsilon";
  public static final String BIN_LIMIT             = "bin_limit";
  public static final String BUCKET                = "bucket";
  public static final String CANCELLED             = "cancelled";
  public static final String CASE                  = "case";
  public static final String CASE_MODE             = "case_mode";
  public static final String CLASS                 = "response_variable";
  public static final String CLOUD_NAME            = "cloud_name";
  public static final String CLOUD_SIZE            = "cloud_size";
  public static final String CLUSTERS              = "clusters";
  public static final String COEFFICIENTS          = "coefficients";
  public static final String COLS                  = "cols";
  public static final String CONSENSUS             = "consensus";
  public static final String CONTENTS              = "contents";
  public static final String COUNT                 = "count";
  public static final String DATA_KEY              = "data_key";
  public static final String DEPTH                 = "depth";
  public static final String DESCRIPTION           = "description";
  public static final String DEST_KEY              = "destination_key";
  public static final String DTHRESHOLDS           = "thresholds";
  public static final String END_TIME              = "end_time";
  public static final String ENUM_DOMAIN_SIZE      = "enum_domain_size";
  public static final String EPSILON               = "epsilon";
  public static final String ERROR                 = "error";
  public static final String ESCAPE_NAN            = "escape_nan";
  public static final String EXCLUSIVE_SPLIT_LIMIT = "exclusive_split_limit";
  public static final String EXPRESSION            = "expression";
  public static final String FAILED                = "failed";
  public static final String FAMILY                = "family";
  public static final String FEATURES              = "features";
  public static final String FILE                  = "file";
  public static final String FILES                 = "files";
  public static final String FILTER                = "filter";
  public static final String FJ_QUEUE_HI           = "fj_queue_hi";
  public static final String FJ_QUEUE_LO           = "fj_queue_lo";
  public static final String FJ_THREADS_HI         = "fj_threads_hi";
  public static final String FJ_THREADS_LO         = "fj_threads_lo";
  public static final String FREE_DISK             = "free_disk" + Suffixes.BYTES;
  public static final String FREE_MEM              = "free_mem" + Suffixes.BYTES;
  public static final String HEADER                = "header";
  public static final String HEIGHT                = "height";
  public static final String HELP                  = "help";
  public static final String IGNORE                = "ignore";
  public static final String ITEMS                 = "items";
  public static final String ITERATIVE_CM          = "iterative_cm";
  public static final String JOB                   = "job";
  public static final String JOBS                  = "jobs";
  public static final String JSON_H2O              = "h2o";
  public static final String K                     = "k";
  public static final String KEY                   = "key";
  public static final String KEYS                  = "keys";
  public static final String LAMBDA                = "lambda";
  public static final String LIMIT                 = "limit";
  public static final String LINK                  = "link";
  public static final String LOCKED                = "locked";
  public static final String MAX                   = "max";
  public static final String MAX_DISK              = "max_disk" + Suffixes.BYTES;
  public static final String MAX_ITER              = "max_iter";
  public static final String MAX_MEM               = "max_mem" + Suffixes.BYTES;
  public static final String MAX_ROWS              = "max_rows";
  public static final String MEAN                  = "mean";
  public static final String MIN                   = "min";
  public static final String MODEL_KEY             = "model_key";
  public static final String MODELS                = "models";
  public static final String MORE                  = "more";
  public static final String MTRY                  = "mtry";
  public static final String MTRY_NODES            = "mtry_nodes";
  public static final String NAME                  = "name";
  public static final String NEG_X                 = "neg_x";
  public static final String NO_CM                 = "no_confusion_matrix";
  public static final String NODE                  = "node";
  public static final String NODE_NAME             = "node_name";
  public static final String NODES                 = "nodes";
  public static final String NORMALIZE             = "normalize";
  public static final String NUM_COLS              = "num_cols";
  public static final String NUM_CPUS              = "num_cpus";
  public static final String NUM_KEYS              = "num_keys";
  public static final String NUM_MISSING_VALUES    = "num_missing_values";
  public static final String NUM_ROWS              = "num_rows";
  public static final String NUM_TREES             = "ntree";
  public static final String NUM_SUCCEEDED         = "num_succeeded";
  public static final String NUM_FAILED            = "num_failed";
  public static final String OBJECT                = "object";
  public static final String OFFSET                = "offset";
  public static final String OOBEE                 = "out_of_bag_error_estimate";
  public static final String PARALLEL              = "parallel";
  public static final String PATH                  = "path";
  public static final String PREVIOUS_MODEL_KEY    = "previous_model_key";
  public static final String PROGRESS              = "progress";
  public static final String PROGRESS_KEY          = "progress_key";
  public static final String PROGRESS_TOTAL        = "progress_total";
  public static final String REDIRECT              = "redirect_request";
  public static final String REDIRECT_ARGS         = "redirect_request_args";
  public static final String REPLICATION_FACTOR    = "replication_factor";
  public static final String REQUEST_TIME          = "time";
  public static final String RESPONSE              = "response";
  public static final String RHO                   = "rho";
  public static final String ROW                   = "row";
  public static final String ROW_SIZE              = "row_size";
  public static final String ROWS                  = "rows";
  public static final String RPCS                  = "rpcs";
  public static final String SAMPLE                = "sample";
  public static final String SCALE                 = "scale";
  public static final String SAMPLING_STRATEGY     = "sampling_strategy";
  public static final String SEED                  = "seed";
  public static final String SEPARATOR             = "separator";
  public static final String SENT_ROWS             = "sent_rows";
  public static final String SIZE                  = "size";
  public static final String SOURCE_KEY            = "source_key";
  public static final String STACK_TRACES          = "stack_traces";
  public static final String START_TIME            = "start_time";
  public static final String STATUS                = "status";
  public static final String STEP                  = "step";
  public static final String STAT_TYPE             = "stat_type";
  public static final String STRATA_SAMPLES        = "strata_samples";
  public static final String SUCCEEDED             = "succeeded";
  public static final String SYSTEM_LOAD           = "system_load";
  public static final String TASK_KEY              = "task_key";
  public static final String TCPS_ACTIVE           = "tcps_active";
  public static final String TCPS_DUTY             = "tcp_duty_cycle";
  public static final String TIME                  = "time";
  public static final String TOT_MEM               = "tot_mem" + Suffixes.BYTES;
  public static final String TREE_COUNT            = "number_built";
  public static final String TREE_DEPTH            = "depth";
  public static final String TREE_LEAVES           = "leaves";
  public static final String TREE_NUM              = "tree_number";
  public static final String TREES                 = "trees";
  public static final String TYPE                  = "type";
  public static final String URL                   = "url";
  public static final String VALUE                 = "value";
  public static final String VALUE_SIZE            = "value_size" + Suffixes.BYTES;
  public static final String VALUE_TYPE            = "type";
  public static final String VARIANCE              = "variance";
  public static final String VIEW                  = "view";
  public static final String WARNINGS              = "warnings";
  public static final String WEIGHT                = "weight";
  public static final String WEIGHTS               = "class_weights";
  public static final String WIDTH                 = "width";
  public static final String X                     = "x";
  public static final String XVAL                  = "n_folds";
  public static final String Y                     = "y";

  static { assert Check.staticFinalStrings(Constants.class); }
}
