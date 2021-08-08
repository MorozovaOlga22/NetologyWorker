package org.example;

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}
