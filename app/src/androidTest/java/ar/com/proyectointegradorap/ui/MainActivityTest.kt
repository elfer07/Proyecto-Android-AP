package ar.com.proyectointegradorap.ui

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import ar.com.proyectointegradorap.R
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_compare() {
        Espresso.onView(
            ViewMatchers.withId(R.id.et_edit_one)
        ).perform(
            ViewActions.typeText("1")
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.et_edit_two)
        ).perform(
            ViewActions.typeText("1")
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.btn_compare)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.tv_result)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText(R.string.same)
            )
        )
    }
}