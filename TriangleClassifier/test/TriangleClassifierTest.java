import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassify222() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassify223() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassify345() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassify823() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifyNegative() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassify011() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.triangleClassify(a, b, c);
        assertEquals(expected, result);
    }
}