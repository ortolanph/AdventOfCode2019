package pho.adventofcode.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public final class FileUtils {
    private static final String SEPARATOR = ",";

    private FileUtils() {
    }

    public static List<Long> loadLong(String file) throws IOException {
        return Files
                .lines(Paths.get(file))
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }

    public static List<String[]> loadArrayInList(String file) throws IOException {
        return Files
                .lines(Paths.get(file))
                .map(line -> line.split(SEPARATOR))
                .collect(Collectors.toList());
    }
}