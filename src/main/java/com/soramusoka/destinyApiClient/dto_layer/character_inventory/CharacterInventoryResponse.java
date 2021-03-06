package com.soramusoka.destinyApiClient.dto_layer.character_inventory;

import com.soramusoka.destinyApiClient.dto_layer.ResponseData;
import com.soramusoka.destinyApiClient.dto_layer.ServerResponse;
import com.soramusoka.destinyApiClient.dto_layer.common.BaseAccountDefinitionGroup;

public class CharacterInventoryResponse extends ServerResponse {
    public ResponseData<CharacterInventoryGroup, BaseAccountDefinitionGroup> Response;
}
