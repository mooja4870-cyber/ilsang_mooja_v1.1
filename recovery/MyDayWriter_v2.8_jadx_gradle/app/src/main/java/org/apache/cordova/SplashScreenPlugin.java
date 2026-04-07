package org.apache.cordova;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class SplashScreenPlugin extends CordovaPlugin {
    private static final boolean DEFAULT_AUTO_HIDE = true;
    private static final int DEFAULT_DELAY_TIME = -1;
    private static final boolean DEFAULT_FADE = true;
    private static final int DEFAULT_FADE_TIME = 500;
    static final String PLUGIN_NAME = "CordovaSplashScreenPlugin";
    private boolean autoHide;
    private int delayTime;
    private int fadeDuration;
    private boolean isFadeEnabled;
    private boolean keepOnScreen = true;

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
        this.autoHide = this.preferences.getBoolean("AutoHideSplashScreen", true);
        this.delayTime = this.preferences.getInteger("SplashScreenDelay", -1);
        LOG.d(PLUGIN_NAME, "Auto Hide: " + this.autoHide);
        if (this.delayTime != -1) {
            LOG.d(PLUGIN_NAME, "Delay: " + this.delayTime + "ms");
        }
        this.isFadeEnabled = this.preferences.getBoolean("FadeSplashScreen", true);
        this.fadeDuration = this.preferences.getInteger("FadeSplashScreenDuration", DEFAULT_FADE_TIME);
        LOG.d(PLUGIN_NAME, "Fade: " + this.isFadeEnabled);
        if (this.isFadeEnabled) {
            LOG.d(PLUGIN_NAME, "Fade Duration: " + this.fadeDuration + "ms");
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (!action.equals("hide") || this.autoHide) {
            return false;
        }
        this.keepOnScreen = false;
        callbackContext.success();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // org.apache.cordova.CordovaPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onMessage(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -505277536: goto L12;
                case 545384656: goto L8;
                default: goto L7;
            }
        L7:
            goto L1c
        L8:
            java.lang.String r0 = "setupSplashScreen"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L1d
        L12:
            java.lang.String r0 = "onPageFinished"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L1d
        L1c:
            r0 = -1
        L1d:
            switch(r0) {
                case 0: goto L25;
                case 1: goto L21;
                default: goto L20;
            }
        L20:
            goto L2c
        L21:
            r1.attemptCloseOnPageFinished()
            goto L2c
        L25:
            r0 = r3
            androidx.core.splashscreen.SplashScreen r0 = (androidx.core.splashscreen.SplashScreen) r0
            r1.setupSplashScreen(r0)
        L2c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.SplashScreenPlugin.onMessage(java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void setupSplashScreen(SplashScreen splashScreen) {
        splashScreen.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda0
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean shouldKeepOnScreen() {
                return this.f$0.m1745lambda$setupSplashScreen$0$orgapachecordovaSplashScreenPlugin();
            }
        });
        if (this.autoHide && this.delayTime != -1) {
            Handler splashScreenDelayHandler = new Handler(this.cordova.getContext().getMainLooper());
            splashScreenDelayHandler.postDelayed(new Runnable() { // from class: org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1746lambda$setupSplashScreen$1$orgapachecordovaSplashScreenPlugin();
                }
            }, this.delayTime);
        }
        if (this.isFadeEnabled) {
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: org.apache.cordova.SplashScreenPlugin.1
                @Override // androidx.core.splashscreen.SplashScreen.OnExitAnimationListener
                public void onSplashScreenExit(final SplashScreenViewProvider splashScreenViewProvider) {
                    View splashScreenView = splashScreenViewProvider.getView();
                    splashScreenView.animate().alpha(0.0f).setDuration(SplashScreenPlugin.this.fadeDuration).setStartDelay(0L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: org.apache.cordova.SplashScreenPlugin.1.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            splashScreenViewProvider.remove();
                        }
                    }).start();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setupSplashScreen$0$org-apache-cordova-SplashScreenPlugin, reason: not valid java name */
    /* synthetic */ boolean m1745lambda$setupSplashScreen$0$orgapachecordovaSplashScreenPlugin() {
        return this.keepOnScreen;
    }

    /* JADX INFO: renamed from: lambda$setupSplashScreen$1$org-apache-cordova-SplashScreenPlugin, reason: not valid java name */
    /* synthetic */ void m1746lambda$setupSplashScreen$1$orgapachecordovaSplashScreenPlugin() {
        this.keepOnScreen = false;
    }

    private void attemptCloseOnPageFinished() {
        if (this.autoHide && this.delayTime == -1) {
            this.keepOnScreen = false;
        }
    }
}
