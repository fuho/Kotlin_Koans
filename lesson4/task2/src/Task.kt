class LazyProperty(val initializer: () -> Int) {
    var _lazy: Int? = null
    val lazy: Int
        get(): Int {
            if (_lazy == null) {
                _lazy = initializer()
            }
            return _lazy!!
        }
}
