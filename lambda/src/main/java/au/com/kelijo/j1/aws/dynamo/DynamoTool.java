package au.com.kelijo.j1.aws.dynamo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

public class DynamoTool {

    Region region = Region.AP_SOUTHEAST_2;
    DynamoDbClient ddb = DynamoDbClient.builder().region(region).build();

    

    
}
