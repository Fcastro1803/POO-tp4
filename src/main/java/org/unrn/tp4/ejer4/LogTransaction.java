package org.unrn.tp4.ejer4;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogTransaction {
    private static final String LOG_FILE = "log.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public void log(String className) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(FORMATTER);
            writer.write(timestamp + " - " + className + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
