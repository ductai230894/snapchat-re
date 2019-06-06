package com.snap.identity.loginsignup.ui.pages.odlv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.identity.api.sharedui.SubmitResendButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jgk;
import defpackage.zjk;
import defpackage.zjm;

public final class LoginOdlvVerifyingFragment extends LoginSignupFragment implements jgk {
    public LoginOdlvVerifyingPresenter a;
    private EditText b;
    private TextView c;
    private TextView d;
    private TextView e;
    private SubmitResendButton f;

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("codeField");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
        if (loginOdlvVerifyingPresenter == null) {
            akcr.a("presenter");
        }
        loginOdlvVerifyingPresenter.d = true;
        loginOdlvVerifyingPresenter.d();
        loginOdlvVerifyingPresenter.d = false;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("pageContext");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a(Event.ERROR_MESSAGE);
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("troubleVerifying");
        }
        return textView;
    }

    public final SubmitResendButton f() {
        SubmitResendButton submitResendButton = this.f;
        if (submitResendButton == null) {
            akcr.a("continueButton");
        }
        return submitResendButton;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
        if (loginOdlvVerifyingPresenter == null) {
            akcr.a("presenter");
        }
        loginOdlvVerifyingPresenter.takeTarget((jgk) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_login_odlv_verifying, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
        if (loginOdlvVerifyingPresenter == null) {
            akcr.a("presenter");
        }
        loginOdlvVerifyingPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.odlv_verifying_code_field);
        akcr.a(findViewById, "view.findViewById(R.id.odlv_verifying_code_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.odlv_verifying_page_context);
        akcr.a(findViewById, "view.findViewById(R.id.o…v_verifying_page_context)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.odlv_verifying_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.o…_verifying_error_message)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.odlv_verifying_trouble_verifying);
        akcr.a(findViewById, "view.findViewById(R.id.o…ifying_trouble_verifying)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        Object findViewById2 = view.findViewById(R.id.odlv_verifying_continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.o…erifying_continue_button)");
        SubmitResendButton submitResendButton = (SubmitResendButton) findViewById2;
        akcr.b(submitResendButton, str);
        this.f = submitResendButton;
    }
}