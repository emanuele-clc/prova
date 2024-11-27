package it.unical.repo_emanuele;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private static App app;
    private static DateTimeFormatter dtf;

    @BeforeAll
    public static void setUpBeforeClass(){
        app = new App();
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime inizio = LocalDateTime.now();
        System.out.println(dtf.format(inizio));
    }

    @AfterAll
    public static void tearDownAfterClass(){
        LocalDateTime fine = LocalDateTime.now();
        System.out.println(dtf.format(fine));
    }
    @Test
    public void testAscendente(){
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        List<Integer> ordinata = app.sort(lista,0);
        assertEquals(lista, Arrays.asList(1,2,3,4,5));
    }

    @Test
    public void testDiscendente(){
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        List<Integer> ordinata = app.sort(lista,1);
        assertEquals(lista, Arrays.asList(5,4,3,2,1));
    }



}
