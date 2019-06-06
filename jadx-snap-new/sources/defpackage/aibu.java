package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aibv.class)
/* renamed from: aibu */
public class aibu extends aezl implements aezk {
    @SerializedName("time_unit")
    public String a;
    @SerializedName("singular_name")
    public String b;
    @SerializedName("plural_name")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aibu)) {
            aibu aibu = (aibu) obj;
            return Objects.equal(this.a, aibu.a) && Objects.equal(this.b, aibu.b) && Objects.equal(this.c, aibu.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}