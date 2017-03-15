import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by c on 3/15/17.
 */
class MyMusicRepositoryTest {
    private MyMusicRepository subject;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        subject = new MyMusicRepository();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @Test
    void firstTest()
    {
        assertEquals(5, subject.deleteme());
    }

}