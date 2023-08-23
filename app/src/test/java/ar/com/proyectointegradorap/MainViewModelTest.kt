package ar.com.proyectointegradorap

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class MainViewModelTest {

    private lateinit var viewModel: MainViewModel
    private val mockTextOne = "1"
    private val mockTextTwo = "1"
    private val mockTextThree = "hola"

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun testingFunctionCompareTrue() = runTest {
        val result = viewModel.isTextSame(mockTextOne, mockTextTwo)

        assertTrue("Son Iguales", result)
    }

    @Test
    fun testingFunctionCompareFalse() = runTest {
        val result = viewModel.isTextSame(mockTextOne, mockTextThree)

        assertFalse("No Son Iguales", result)
    }

}