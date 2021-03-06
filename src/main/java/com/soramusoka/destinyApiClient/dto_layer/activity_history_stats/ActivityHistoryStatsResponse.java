package com.soramusoka.destinyApiClient.dto_layer.activity_history_stats;

import com.soramusoka.destinyApiClient.dto_layer.ResponseData;
import com.soramusoka.destinyApiClient.dto_layer.ServerResponse;
import com.soramusoka.destinyApiClient.dto_layer.common.BaseAccountDefinitionGroup;

public class ActivityHistoryStatsResponse extends ServerResponse {
    public ResponseData<ActivityHistoryStatsGroup, BaseAccountDefinitionGroup> Response;
}
