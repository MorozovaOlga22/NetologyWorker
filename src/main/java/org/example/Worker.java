package org.example;

class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener callbackError;

    Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                callbackError.onError("Task " + i + " is failed");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
