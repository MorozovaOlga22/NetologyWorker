package org.example;

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}
