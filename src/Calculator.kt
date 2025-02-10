class Calculator(public val num1: Double, public val num2: Double) {
        public fun add(): Double {
            return num1 + num2
        }

        public fun subtract(): Double {
            return num1 - num2
        }

        public fun multiply(): Double {
            return num1 * num2
        }
    }
