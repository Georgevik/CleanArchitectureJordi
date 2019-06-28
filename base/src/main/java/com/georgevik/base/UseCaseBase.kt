package com.georgevik.base

abstract class UseCaseBase<in PARAMS, out OUTPUT> {
    abstract fun run(param: PARAMS): OUTPUT
}