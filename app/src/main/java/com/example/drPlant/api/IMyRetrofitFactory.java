package com.example.drPlant.api;

import com.example.drPlant.api.plantDisease.ICustomVisionService;

public interface IMyRetrofitFactory {
    ICustomVisionService getCustomVisionService();
}
