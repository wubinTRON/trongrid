package org.tron.trongrid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "contractevent")
public class ContractEventTriggerEntity {
  private static final long serialVersionUID = -70777625567836430L;

  @Id
  private String id;

  @Field(value = "eventSignature")
  @JsonProperty(value = "eventSignature")
  private String eventSignature;

  @Field(value = "topicMap")
  @JsonProperty(value = "topicMap")
  private Map<String, String> topicMap;

  @Field(value = "dataMap")
  @JsonProperty(value = "dataMap")
  private Map<String, String> dataMap;

  @Field(value = "transactionId")
  @JsonProperty(value = "transactionId")
  private String transactionId;

  @Field(value = "contractAddress")
  @JsonProperty(value = "contractAddress")
  private String contractAddress;

  @Field(value = "callerAddress")
  @JsonProperty(value = "callerAddress")
  private String callerAddress;

  @Field(value = "originAddress")
  @JsonProperty(value = "originAddress")
  private String originAddress;

  @Field(value = "creatorAddress")
  @JsonProperty(value = "creatorAddress")
  private String creatorAddress;

  @Field(value = "blockNumber")
  @JsonProperty(value = "blockNumber")
  private Long blockNumber;

  @Field(value = "removed")
  @JsonProperty(value = "removed")
  private String removed;

  @Field(value = "timeStamp")
  @JsonProperty(value = "timeStamp")
  protected long timeStamp;

  @Field(value = "triggerName")
  @JsonProperty(value = "triggerName")
  private String triggerName;

  public Map<String, String> getTopicMap() {
    return topicMap;
  }

  public ContractEventTriggerEntity(String eventSignature, Map<String, String> topicMap,
      Map<String, String> dataMap, String transactionId, String contractAddress,
      String callerAddress, String originAddress,
      String creatorAddress, Long blockNumber,String removed,long timeStamp, String triggerName) {
    this.eventSignature = eventSignature;
    this.topicMap = topicMap;
    this.dataMap = dataMap;
    this.transactionId = transactionId;
    this.contractAddress = contractAddress;
    this.callerAddress = callerAddress;
    this.originAddress = originAddress;
    this.creatorAddress = creatorAddress;
    this.blockNumber = blockNumber;
    this.removed = removed;
    this.timeStamp = timeStamp;
    this.triggerName = triggerName;
  }

}
