package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aces */
public final class aces extends ExtendableMessageNano<aces> {
    private aceq[] a;

    public aces() {
        this.a = aceq.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aceq[] aceqArr = this.a;
        if (aceqArr != null && aceqArr.length > 0) {
            int i = 0;
            while (true) {
                aceq[] aceqArr2 = this.a;
                if (i >= aceqArr2.length) {
                    break;
                }
                MessageNano messageNano = aceqArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                aceq[] aceqArr = this.a;
                int length = aceqArr == null ? 0 : aceqArr.length;
                aceq[] aceqArr2 = new aceq[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, aceqArr2, 0, length);
                }
                while (length < aceqArr2.length - 1) {
                    aceqArr2[length] = new aceq();
                    codedInputByteBufferNano.readMessage(aceqArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aceqArr2[length] = new aceq();
                codedInputByteBufferNano.readMessage(aceqArr2[length]);
                this.a = aceqArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aceq[] aceqArr = this.a;
        if (aceqArr != null && aceqArr.length > 0) {
            int i = 0;
            while (true) {
                aceq[] aceqArr2 = this.a;
                if (i >= aceqArr2.length) {
                    break;
                }
                MessageNano messageNano = aceqArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
