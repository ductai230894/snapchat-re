package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aemy */
public final class aemy extends TypeAdapter<aemx> {
    private final Gson a;

    public aemy(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aemx read(com.google.gson.stream.JsonReader r8) {
        /*
        r7 = this;
        r0 = r8.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r8.nextNull();
        r8 = 0;
        return r8;
    L_0x000d:
        r0 = new aemx;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00c3;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -2145187362; // 0xffffffff802309de float:-3.217782E-39 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = -1239137217; // 0xffffffffb624443f float:-2.4477629E-6 double:NaN;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 57275874; // 0x369f5e2 float:6.8754806E-37 double:2.82980417E-316;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "request_token_only";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 1;
        goto L_0x0058;
    L_0x0043:
        r4 = "friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 0;
        goto L_0x0058;
    L_0x004d:
        r4 = "added_friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 2;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00a1;
    L_0x005a:
        if (r2 == r1) goto L_0x007f;
    L_0x005c:
        if (r2 == r6) goto L_0x0062;
    L_0x005e:
        r8.skipValue();
        goto L_0x0019;
    L_0x0062:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006b;
    L_0x006a:
        goto L_0x00a9;
    L_0x006b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0078;
    L_0x006f:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007c;
    L_0x0078:
        r2 = r8.nextString();
    L_0x007c:
        r0.c = r2;
        goto L_0x0019;
    L_0x007f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0088;
    L_0x0087:
        goto L_0x00a9;
    L_0x0088:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0095;
    L_0x008c:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0099;
    L_0x0095:
        r2 = r8.nextBoolean();
    L_0x0099:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x00a1:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ae;
    L_0x00a9:
        r8.nextNull();
        goto L_0x0019;
    L_0x00ae:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00bb;
    L_0x00b2:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00bf;
    L_0x00bb:
        r2 = r8.nextString();
    L_0x00bf:
        r0.a = r2;
        goto L_0x0019;
    L_0x00c3:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemy.read(com.google.gson.stream.JsonReader):aemx");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aemx aemx) {
        if (aemx == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aemx.a != null) {
            jsonWriter.name("friends_sync_token");
            jsonWriter.value(aemx.a);
        }
        if (aemx.b != null) {
            jsonWriter.name("request_token_only");
            jsonWriter.value(aemx.b.booleanValue());
        }
        if (aemx.c != null) {
            jsonWriter.name("added_friends_sync_token");
            jsonWriter.value(aemx.c);
        }
        jsonWriter.endObject();
    }
}
