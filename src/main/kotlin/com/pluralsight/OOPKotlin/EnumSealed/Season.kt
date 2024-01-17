package com.pluralsight.OOPKotlin.EnumSealed

enum class Season {
    Spring {
        override fun next(): Season {
            return Summer
        }
    },
    Summer {
        override fun next(): Season {
            return Autumn
        }
    },
    Autumn {
        override fun next(): Season {
            return Winter
        }
    },
    Winter {
        override fun next(): Season {
            return Spring
        }
    };

    abstract fun next() : Season
}