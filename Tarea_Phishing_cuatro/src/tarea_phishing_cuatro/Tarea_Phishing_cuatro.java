/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_phishing_cuatro;

import java.util.Scanner;


public class Tarea_Phishing_cuatro {

 
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
          
          return count;
     }
    
}
