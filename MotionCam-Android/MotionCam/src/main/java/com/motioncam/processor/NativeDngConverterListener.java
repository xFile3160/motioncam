package com.motioncam.processor;

public interface NativeDngConverterListener {
    int onNeedFd(int frameNumber);
    boolean onProgressUpdate(int progress);
    void onCompleted();
    void onError(String error);
}
