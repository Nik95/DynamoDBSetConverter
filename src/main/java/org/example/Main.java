package org.example;

import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

public class Main {

    public static void main(String[] args) {
        TableSchema.fromClass(Order.class);
    }
}
