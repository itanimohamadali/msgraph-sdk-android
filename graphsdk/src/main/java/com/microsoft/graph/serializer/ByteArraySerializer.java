// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.serializer;

import java.util.Base64;

import java.text.ParseException;

/**
 * Serializer for Byte[]s
 */
public final class ByteArraySerializer {

    /**
     * Not available for instantiation.
     */
    private ByteArraySerializer() {
    }

    /**
     * Deserializes a string
     * @param strVal the value to deserialize
     * @return The string encoded bytes
     * @throws ParseException If there is any problem processing the value
     */
    public static byte[] deserialize(final String strVal) throws ParseException {
        return Base64.getDecoder().decode(strVal);
    }

    /**
     * Serializes the string.
     *
     * @param src The src.
     * @return The string.
     */
    public static String serialize(final byte[] src) {
        return Base64.getEncoder().encodeToString(src);
    }
}
