package com.snap.core.db.api.androidxSqlbrite;

import defpackage.ac;
import defpackage.akcr;
import defpackage.pc;

public final class SupportSQLiteToAndroidxProgram implements pc {
    private final ac program;

    public SupportSQLiteToAndroidxProgram(ac acVar) {
        akcr.b(acVar, "program");
        this.program = acVar;
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.program.bindBlob(i, bArr);
    }

    public final void bindDouble(int i, double d) {
        this.program.bindDouble(i, d);
    }

    public final void bindLong(int i, long j) {
        this.program.bindLong(i, j);
    }

    public final void bindNull(int i) {
        this.program.bindNull(i);
    }

    public final void bindString(int i, String str) {
        this.program.bindString(i, str);
    }

    public final void clearBindings() {
        this.program.clearBindings();
    }

    public final void close() {
        this.program.close();
    }

    public final ac getProgram() {
        return this.program;
    }
}
