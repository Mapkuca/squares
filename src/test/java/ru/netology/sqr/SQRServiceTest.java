package ru.netology.sqr;
    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class SQRServiceTest {

        @Test
        public void shouldCalculateSquaresCountStart500() {
            SQRService service = new SQRService();
            int min = 500;
            int max = 600;
            int expected = 2;

            int actual = service.sqrCalculateSquares(min, max);

            assertEquals(expected, actual);
        }


        @Test
        public void shouldCalculateSquaresCountStart1() {
            SQRService service = new SQRService();
            int min = 1;
            int max = 100;
            int expected = 1;

            int actual = service.sqrCalculateSquares(min, max);

            assertEquals(expected, actual);
        }

        @Test
        public void shouldCalculateSquaresCountStart100() {
            SQRService service = new SQRService();
            int min = 100;
            int max = 600;
            int expected = 15;

            int actual = service.sqrCalculateSquares(min, max);

            assertEquals(expected, actual);
        }

        @Test
        public void shouldCalculateSquaresCountStart600() {
            SQRService service = new SQRService();
            int min = 600;
            int max = 1000;
            int expected = 7;

            int actual = service.sqrCalculateSquares(min, max);

            assertEquals(expected, actual);
        }

    }
