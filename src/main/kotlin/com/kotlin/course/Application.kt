package com.kotlin.course

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.kotlin.course")
		.start()
}

