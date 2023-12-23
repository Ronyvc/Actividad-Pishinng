
package tarea_phishing;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tarea_Phishing {

    
    public static void main(String[] args) {
        
        String[] keywords = {
            "Importante", "Acceso a cuenta", "Premio", "Gana dinero rápido", "Ganador afortunado",
            "Gratis total", "Bloqueo cuenta", "Vencimiento de cuenta", "Verificación necesaria", "Actualizar datos",
            "Confirmación de identidad", "Contraseña segura", "Verificación cuenta", "Actualización urgente requerida", "Oferta especial exclusiva",
            "Problemas de seguridad detectados", "Suspensión temporal de cuenta", "Promoción única y especial", "Actualiza información",
            "Problemas inicio de sesión", "Obtén tu premio", "Restablecer la cuenta", "Problema inicio de sesión", "Oferta limitada en el tiempo",
            "Recupera el acceso", "Advertencia de seguridad importante", "Confirma tu identidad", "Oferta promocional increíble",
            "Realiza la actualización ahora", "Cierre temporal de cuenta"
        };
        
        int[] scores = {1, 1, 2, 2, 3, 3, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 1, 1, 2, 2, 1, 1, 1, 1, 1, 3, 3, 3, 3};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto a analizar: ");
        String text = scanner.nextLine();
        
        int totalScore = 0;
        
        for (int i = 0; i < keywords.length; i++) {
            int occurrences = countOccurrences(text, keywords[i]);
            if (occurrences > 0) {
                int score = occurrences * scores[i];
                System.out.printf("PALABRA CLAVE: %s, OCURRENCIAS: %d, PUNTAJE: %d%n",
                        keywords[i], occurrences, score);
                totalScore += score;
            }
        }
        
        System.out.println("PUNTAJE TOTAL: " + totalScore);
    }

    private static int countOccurrences(String text, String keyword) {
        int count = 0;
        int index = text.indexOf(keyword);
        while (index != -1) {
            count++;
            index = text.indexOf(keyword, index + keyword.length());
        }
        return count;
    }

    
}
