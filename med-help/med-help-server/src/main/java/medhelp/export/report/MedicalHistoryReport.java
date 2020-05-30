package medhelp.export.report;

import medhelp.presentation.dto.MedicalHistoryDTO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MedicalHistoryReport implements Report{
    @Override
    public void dumpReport(MedicalHistoryDTO medicalHistoryDTO) {
        try {
            Files.createDirectories(Paths.get("reports"));
            Path path = Paths.get("reports","text-report.txt");
            new File(path.toUri());

            writeToFile(path, "This is a medical history text report \n");
            writeToFile(path, "Has chills: " + medicalHistoryDTO.getChills()+ " \n");
            writeToFile(path, "Has cough: " + medicalHistoryDTO.getCough()+ " \n");
            writeToFile(path, "Has fever: " + medicalHistoryDTO.getFever()+ " \n");
            writeToFile(path, "Has headache: " + medicalHistoryDTO.getHeadache()+ " \n");
            writeToFile(path, "Has muscle pain: " + medicalHistoryDTO.getMusclePain()+ " \n");
            writeToFile(path, "Has shortness of breath: " + medicalHistoryDTO.getShortnessOfBreath()+ " \n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(Path path, String textToWrite) {
        try {
            Files.write(path, textToWrite.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
