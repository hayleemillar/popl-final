package com.hay.parser;

import com.hay.parser.Types;

public class Data {
    Types type;
    Object value;

    public Data(Types type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String toString() {
        return value.toString();
    }
}
