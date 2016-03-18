class GlobalConst(
                  val NAME: String ,
                  val MIN_FONT_SIZE: Int,
                  val MAX_FONT_SIZE: Int ,
                  val FONT_SIZE_STEP: Int ,
                  val DEFAULT_THEME: String ,
                  val DEFAULT_FONT_STYLE: String ,
                  val DEFAULT_FONT_SIZE: Int,
                  val DEFAULT_TAB_SIZE: Int,
                  val DEFAULT_MAX_FILE_SIZE: Int
                  )

object GlobalConst {

  def apply(NAME: String = "LithePad v0.0.0.17 ",
            MIN_FONT_SIZE: Int = 16,
            FONT_SIZE_STEP: Int = 60,
            MAX_FONT_SIZE: Int = 4,
            DEFAULT_THEME: String = "Monokai",
            DEFAULT_FONT_STYLE: String = "Monospaced",
            DEFAULT_FONT_SIZE: Int = 16,
            DEFAULT_TAB_SIZE: Int = 2,
            DEFAULT_MAX_FILE_SIZE: Int = 2000000): GlobalConst =

            new GlobalConst(NAME,
                            MIN_FONT_SIZE,
                            FONT_SIZE_STEP,
                            MAX_FONT_SIZE,
                            DEFAULT_THEME,
                            DEFAULT_FONT_STYLE,
                            DEFAULT_FONT_SIZE,
                            DEFAULT_TAB_SIZE,
                            DEFAULT_MAX_FILE_SIZE
            )

}