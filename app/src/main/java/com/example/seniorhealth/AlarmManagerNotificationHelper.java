package com.example.seniorhealth;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.Calendar;

public class AlarmManagerNotificationHelper {

    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "medication_channel";
    private static final CharSequence CHANNEL_NAME = "Medication Channel";

    public static void agendarNotificacaoMedicamento(Context context, int hora, int minuto, String medicamento) {
        // Calcular o tempo em que a notificação deve ser exibida
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hora);
        calendar.set(Calendar.MINUTE, minuto);
        calendar.set(Calendar.SECOND, 0);

        long tempoNotificacao = calendar.getTimeInMillis();

        // Configurar o AlarmManager para disparar o BroadcastReceiver
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString("MEDICAMENTO", medicamento);
        intent.putExtras(bundle);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.set(AlarmManager.RTC_WAKEUP, tempoNotificacao, pendingIntent);
    }

    public static class AlarmReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle = intent.getExtras();
            if (bundle != null && bundle.containsKey("MEDICAMENTO")) {
                String medicamento = bundle.getString("MEDICAMENTO");
                exibirNotificacao(context, medicamento);
            }
        }

        private void exibirNotificacao(Context context, String medicamento) {
            // Criar o canal de notificação (para Android Oreo e posterior)
            createNotificationChannel(context);

            // Criar a notificação
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                    .setSmallIcon(android.R.drawable.ic_dialog_info)
                    .setContentTitle("Hora de tomar o medicamento")
                    .setContentText("Não se esqueça do medicamento: " + medicamento)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setAutoCancel(true);

            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(NOTIFICATION_ID, builder.build());
        }

        private void createNotificationChannel(Context context) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(
                        CHANNEL_ID,
                        CHANNEL_NAME,
                        NotificationManager.IMPORTANCE_HIGH
                );
                channel.setDescription("Notificações de medicamentos");
                NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
                notificationManager.createNotificationChannel(channel);
            }
        }
    }
}





/*


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;

public class NotificationHelper {

    private Context context;
    private NotificationManager notificationManager;
    private static final String CHANNEL_ID = "medication_channel";

    public NotificationHelper(Context context) {
        this.context = context;
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        // Crie um canal de notificação (necessário no Android 8.0 e superior)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "Medication Channel",
                    NotificationManager.IMPORTANCE_HIGH
            );

            channel.setDescription("Notificações de medicamentos");
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void mostrarNotificacao(String titulo, String mensagem) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setContentTitle(titulo)
                .setContentText(mensagem)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);

        Notification notification = builder.build();
        notificationManager.notify(0, notification);
    }
}
*/