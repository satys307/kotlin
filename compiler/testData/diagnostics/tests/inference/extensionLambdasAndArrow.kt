// !DIAGNOSTICS: -UNUSED_VARIABLE -UNUSED_ANONYMOUS_PARAMETER

fun main() {
    val x1: String.() -> String = if (true) {{ this }} else {{ this }}
    val x2: String.() -> String = if (true) {{ -> this }} else {{ -> this }}
    val x3: () -> String = if (true) {{ -> "this" }} else {{ -> "this" }}
    val x4: String.() -> String = if (true) {{ str: String -> "this" }} else {{ str: String -> "this" }}
    val x5: String.() -> String = if (true) {{ str -> "this" }} else {{ str -> "this" }}
    val x6: String.() -> String = if (true) {{ str -> "this" }} else {{ "this" }}
}
