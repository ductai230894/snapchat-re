package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class AlbumArtistBox extends AbstractFullBox {
    public static final String TYPE = "albr";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private String albumArtist;
    private String language;

    static {
        ajc$preClinit();
    }

    public AlbumArtistBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AlbumArtistBox.java", AlbumArtistBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "albumArtist", "", "void"), 54);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 76);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.albumArtist = aqi.d(byteBuffer);
    }

    public String getAlbumArtist() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.albumArtist;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.albumArtist));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) ((aqn.b(this.albumArtist) + 6) + 1);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setAlbumArtist(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.albumArtist = str;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AlbumArtistBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";albumArtist=");
        stringBuilder.append(getAlbumArtist());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
