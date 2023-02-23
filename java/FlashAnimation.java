public class FlashAnimation {

    private ValueAnimator flashingColorAnimation(int flashColor, int originalColor, View view) {

        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), originalColor, flashColor);

        colorAnimation.setDuration(250);
        colorAnimation.setRepeatCount(1);
        colorAnimation.setRepeatMode(ValueAnimator.REVERSE);

        colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                view.setBackgroundColor((int) animator.getAnimatedValue()); // change view to element you want to animate using findViewById()
            }

        });

        return colorAnimation;
    }

}
