package org.example.mrasilbektelegrambot;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
//
//import org.bytedeco.hdf5.H5Location;
//import org.bytedeco.javacpp.Pointer;
//import org.deeplearning4j.datasets.iterator.impl.ListDataSetIterator;
//import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
//import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
//import org.deeplearning4j.nn.conf.layers.DenseLayer;
//import org.deeplearning4j.nn.conf.layers.OutputLayer;
//import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
//import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
//import org.nd4j.linalg.activations.Activation;
//import org.nd4j.linalg.api.ndarray.INDArray;
//import org.nd4j.linalg.api.ops.impl.reduce.bool.All;
//import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
//import org.nd4j.linalg.factory.Nd4j;
//import org.nd4j.linalg.learning.config.Sgd;
//import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//import org.telegram.telegrambots.meta.generics.TelegramBot;
//import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
//import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
//import org.deeplearning4j.nn.conf.layers.DenseLayer;
//import org.deeplearning4j.nn.conf.layers.OutputLayer;
//import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
//import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
//import org.nd4j.linalg.activations.Activation;
//import org.nd4j.linalg.dataset.DataSet;
//import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
//
//import org.nd4j.linalg.factory.Nd4j;
//import org.nd4j.linalg.lossfunctions.LossFunctions;
//import org.nd4j.linalg.api.ndarray.INDArray;
//
//import java.security.Key;
//import java.util.Collections;
import java.util.List;
//
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.objects.InputFile;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//import java.io.*;
//
//import java.io.File;
//import java.net.HttpURLConnection;
//import java.net.URL;
import java.util.*;
//import java.util.logging.Level;

public class MyBot extends TelegramLongPollingBot {


    // pro programmalar
    String telegram = "https://t.me/MrAsilbekSaved/2";
    String duolingo = "https://t.me/MrAsilbekSaved/4";
    String instagram = "https://t.me/MrAsilbekSaved/5";
    String kine_master = "https://t.me/MrAsilbekSaved/6";
    String inshot = "https://t.me/MrAsilbekSaved/7";


    // pro o'yinlar
    String minecraft = "https://t.me/MrAsilbekSaved/8";
    String dream = "https://t.me/MrAsilbekSaved/11";
    String clash = "https://t.me/MrAsilbekSaved/13";


    String url = "\uD83D\uDCF2 Yangi programmani/o'yinni yuklab oling! \uD83D\uDCF2\n" + "\n" +
            "Bu ajoyib o'yin, faqat bizning botimiz orqali taqdim etiladi! \uD83C\uDFAE\n" +
            "O'yindan to'liq zavq olish uchun yuklab oling va hoziroq o'ynashni boshlang! \uD83D\uDE80 \n" +
            "\n" + "\uD83D\uDC49 Har kuni yangi programmani/o'yin va yangilanishlarni olishni xohlaysizmi? " +
            "Bizni kuzatib boring va yangiliklardan birinchi bo'lib xabardor bo'ling! \uD83D\uDD25\n" + "\n" +
            "⏬ O'yin shu botdan olindi :@MrAsilbekChannelBot";

    String gameUrl = "Nomi: Shadow Fight 2\n" + "\n" + "Versiya: 2.2271\n" + "\n" +
            "Android versiyasi: 6.0+\n" + "\n" + "Puli: Cheksiz* [Mod menu]\n" + "\n" +
            "Rejim: Offline\n" + "\n" + "Hajmi: 148 MB\n" + "\n" + "@MrAsilbekChannelBot\n" +
            "\n" + "<a href=\"https://www.youtube.com/@MrAsilbekChannel\">\uD83D\uDED1 - YouTube</a>";

    String urlJava = "\uD83D\uDCF2 Java dasturlash tilini o'rganish videolari! \uD83D\uDCF2\n" +
            "\n" +
            "Bu ajoyib darslar, faqat bizning botimiz orqali taqdim etiladi! \uD83C\uDFAE\n" +
            "Darslardan to'liq zavq olish uchun yuklab oling va hoziroq o'rganishni boshlang! \uD83D\uDE80\n" +
            "\n" +
            "\uD83D\uDC49 Har kuni yangi darslar va yangilanishlarni olishni xohlaysizmi? " +
            "Bizni kuzatib boring va yangiliklardan birinchi bo'lib xabardor bo'ling! \uD83D\uDD25\n" +
            "\n" +
            "⏬ Darslar shu botdan olindi: @MrAsilbekChannelBot\n" +
            "\n" +
            "<a href=\"https://www.youtube.com/@MrAsilbekChannel\">\uD83D\uDED1 - YouTube</a>";

    String urlEnglish = "\uD83C\uDF0E Ingliz tilini o'rganish videolari! \uD83C\uDF0E\n" +
            "\n" +
            "Bu videolar faqat bizning botimiz orqali maxsus taqdim etiladi! \uD83D\uDCF2\n" +
            "To'liqroq tushunish va tez o'rganish uchun darslarni yuklab oling va darhol boshlang! \uD83D\uDE80\n" +
            "\n" +
            "\uD83D\uDC49 Ingliz tilini noldan boshlab o'rganishni istaysizmi? " +
            "Yangilanishlar uchun bizni kuzatib boring va har bir darsni o'tkazib yubormang! \uD83D\uDD25\n" +
            "\n" +
            "⏬ Darslar shu botdan olindi: @MrAsilbekChannelBot\n" +
            "\n" +
            "<a href=\"https://www.youtube.com/@MrAsilbekChannel\">\uD83D\uDED1 - YouTube</a>";
    String urlBotProgramming = "\uD83D\uDCF2 Java orqali Telegram bot yozishni o'rganish videolari! \uD83D\uDCF2\n" +
            "\n" +
            "Endi siz ham o'z botingizni yaratishingiz mumkin! Ushbu video darslar faqat bizning botimiz orqali taqdim etiladi va to'liq tushunishingiz uchun maxsus tayyorlangan! \uD83D\uDE80\n" +
            "\n" +
            "\uD83D\uDC49 Har bir qadamni o‘rganishni va o‘z botingizni yaratishni xohlaysizmi? " +
            "Yangiliklardan birinchi bo‘lib xabardor bo‘lish uchun bizni kuzatib boring! \uD83D\uDD25\n" +
            "\n" +
            "⏬ Darslar shu botdan olindi: @MrAsilbekChannelBot\n" +
            "\n" +
            "<a href=\"https://www.youtube.com/@MrAsilbekChannel\">\uD83D\uDED1 - YouTube</a>";

    String urlRussianUz = "\uD83C\uDDF7\uD83C\uDDFA Rus tilini o'rganish videolari! \uD83C\uDDF7\uD83C\uDDFA\n" +
            "\n" +
            "Bu ajoyib darslar, faqat bizning botimiz orqali taqdim etiladi! \uD83D\uDCF2\n" +
            "Darslardan to'liq zavq olish uchun yuklab oling va hoziroq o'rganishni boshlang! \uD83D\uDE80\n" +
            "\n" +
            "\uD83D\uDC49 Har kuni yangi darslar va yangilanishlarni olishni xohlaysizmi? " +
            "Bizni kuzatib boring va yangiliklardan birinchi bo'lib xabardor bo'ling! \uD83D\uDD25\n" +
            "\n" +
            "⏬ Darslar shu botdan olindi: @MrAsilbekChannelBot\n" +
            "\n" +
            "<a href=\"https://www.youtube.com/@MrAsilbekChannel\">\uD83D\uDED1 - YouTube</a>";


    MyBotService myBotService = new MyBotService();




    // ikkinchi api key agar birinchisi ishlamasa "3d49a761db884f7cb2b37680755c044c"
    private static final String newsApiKey = "2f1ca225e6c24d52a16f04f55952c41d";

    private String fetchLatestNews() {
        String url = "https://newsapi.org/v2/top-headlines?language=en&apiKey=" + newsApiKey;
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseData = response.body().string();
                JSONObject json = new JSONObject(responseData);
                JSONArray articles = json.getJSONArray("articles");

                StringBuilder newsBuilder = new StringBuilder("📰 So'nggi yangiliklar: Habarlar ingilis tilida agar sizga uzbek" +
                        " tilida kerak bo'lsa unda siz  👉Ko'proq o'qish  degan joyiga bosib saytga " + "kirib uzbek tilida o'qib olishingiz mumkin!\n\n");
                for (int i = 0; i < Math.min(5, articles.length()); i++) { // Faqat 5 ta yangilik
                    JSONObject article = articles.getJSONObject(i);
                    String title = article.getString("title");
                    String description = article.has("description") ? article.getString("description") : "Tavsif mavjud emas";
                    String link = article.getString("url");

                    newsBuilder.append("🔹 <b>").append(title).append("</b>\n").append(description).append("\n").append("👉 <a href='").append(link).append("'>Ko'proq o'qish</a>\n\n");
                }
                return newsBuilder.toString();
            } else if (!response.isSuccessful()) {
                String errorBody = response.body().string();
                System.out.println("API xato xabari: " + errorBody);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Yangiliklarni olishda xatolik yuz berdi.";
    }


    private static final String weatherAPiKey = "0f68be6aa102ec0bca9f655e7efdbb77";
    private static final String[] CITIES = {
            "Tashkent",
            "Samarkand",
            "Bukhara",
            "Andijan",
            "Fergana",
            "Nukus",
            "Namangan",
            "Jizzakh",
            "Sirdaryo",
            "Termez",  // Surxondaryo viloyati uchun
            "Qarshi",  // Qashqadaryo viloyati uchun
            "Urgench"  // Xorazm viloyati uchun
    };

    private String fetchWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + ",uz&appid=" + weatherAPiKey + "&units=metric";
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseData = response.body().string();
                JSONObject json = new JSONObject(responseData);

                // Ob-havo ma'lumotlarini olish
                if (json.has("weather") && json.has("main")) { // JSON strukturasini tekshirish
                    String description = json.getJSONArray("weather").getJSONObject(0).getString("description");
                    double temperature = json.getJSONObject("main").getDouble("temp");
                    int humidity = json.getJSONObject("main").getInt("humidity");

                    return String.format("🌤️ %s ob-havo:\n\n" + "📉 Harorat: %.1f°C\n" + "💧 Namlik: %d%%\n" + "🌀 Tavsif: %s\n", city, temperature, humidity, description);
                } else {
                    return "Ob-havo ma'lumotlari topilmadi.";
                }
            } else {
                return "API dan ma'lumot olishda xatolik yuz berdi: " + response.message();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ob-havo ma'lumotlarini olishda xatolik yuz berdi: " + e.getMessage();
        }
    }

    private Map<Long, String> firstNameMap = new HashMap<>();
    private Map<Long, String> genderMap = new HashMap<>();
    private Map<Long, String> stateMap = new HashMap<>();
    private Map<Long, String> logins = new HashMap<>(); // login password
    private Map<Long, String> passwords = new HashMap<>();
    private Map<Long, String> userNumbers = new HashMap<>();

    private Map<Long, String> loginAndPasword = new HashMap<>();



    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();
            String text = message.getText();
            SendDocument sendDocument = new SendDocument();
            sendDocument.setChatId(chatId);
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);

            stateMap.putIfAbsent(chatId, "start");

            if (stateMap.getOrDefault(chatId, "").equals("start")){
                MainMainManuu(chatId);
            } else if (stateMap.getOrDefault(chatId, "").equals("sendLogin")) {
                String login = text;
                logins.put(chatId, login);
                sendMessage.setChatId(chatId);
                sendMessage.setText("Iltimos Parol kiriting!!! \n\n'LOGIN VA PAROLNI ESLAB QOLING PROFILGA KIRISH UCHUN'");
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                stateMap.put(chatId, "namee");
            } else if (stateMap.getOrDefault(chatId, "").equals("namee")) {
                String password = text;
                passwords.put(chatId, password);
                sendMessage.setChatId(chatId);
                sendMessage.setText("Iltimos Ismingizni kiriting!");
                String firstName = update.getMessage().getChat().getFirstName();
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton(firstName);
                row.add(button);
                rowList.add(row);
                replyKeyboardMarkup.setKeyboard(rowList);
                replyKeyboardMarkup.setResizeKeyboard(true);
                sendMessage.setReplyMarkup(replyKeyboardMarkup);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                stateMap.put(chatId, "Gender");
            } else if (stateMap.getOrDefault(chatId, "").equals("Gender")) {
                String ism = text;
                firstNameMap.put(chatId, ism);
                sendMessage.setChatId(chatId);
                sendMessage.setText("Iltimos Jinsingizni tanlang!");
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                row1.add(new KeyboardButton("Erkak"));
                rowList.add(row1);
                KeyboardRow row2 = new KeyboardRow();
                row2.add(new KeyboardButton("Ayol"));
                rowList.add(row2);
                replyKeyboardMarkup.setKeyboard(rowList);
                replyKeyboardMarkup.setResizeKeyboard(true);
                sendMessage.setReplyMarkup(replyKeyboardMarkup);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                stateMap.put(chatId, "number");
            } else if (stateMap.getOrDefault(chatId, "").equals("number")) {
                String gender = text;
                genderMap.put(chatId, gender);
                sendMessage.setChatId(chatId);
                sendMessage.setText("Iltimos raqamingizni yuboring");
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                KeyboardButton button = new KeyboardButton("Raqam Yuborish");
                button.setRequestContact(true);
                row.add(button);
                rowList.add(row);
                replyKeyboardMarkup.setResizeKeyboard(true);
                replyKeyboardMarkup.setKeyboard(rowList);
                sendMessage.setReplyMarkup(replyKeyboardMarkup);
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (stateMap.getOrDefault(chatId, "").equals("login")) {
                String kiritganLogin = text;
                if (logins.containsValue(kiritganLogin)) {
                    sendMessage(chatId, "Login to'g'ri. Iltimos, parolingizni kiriting:");
                    stateMap.put(chatId, "password");
                    loginAndPasword.put(chatId, kiritganLogin);
                } else {
                    sendMessage(chatId, "Kechirasiz, bunday login mavjud emas. Iltimos, qayta urinib ko'ring.");
                    MainMainManuu(chatId);
                }
            } else if (stateMap.getOrDefault(chatId, "").equals("password")) {
                String kiritganParol = text;

                String savedLogin = loginAndPasword.get(chatId);

                if (logins.containsValue(savedLogin) && passwords.containsValue(kiritganParol)) {
                    sendMessage(chatId, "Yaxshi hammasi to'g'ri keldi! \n\n /start bosing!");
                    stateMap.put(chatId, "Salomlarim");
                } else {
                    sendMessage(chatId, "Parol noto'g'ri. Iltimos, qayta urinib ko'ring.");
                    MainMainManuu(chatId);
                }
            } else if (stateMap.getOrDefault(chatId, "").equals("Salomlarim")) {
                try {
                    execute(myBotService.AsosiyMenu(chatId));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                stateMap.put(chatId, "Salomm");
            } else if (stateMap.getOrDefault(chatId, "").equals("Salomm")) {
                AllText(text, chatId, sendDocument, duolingo, url, instagram, kine_master, inshot, minecraft, gameUrl, dream, clash, sendMessage);
            }




          /*  //foydalanuvchi malumoti bormi yoqmi tekshiradi
            if (firstNameMap.containsKey(chatId) && genderMap.containsKey(chatId)) {

                AllText(text, chatId, sendDocument, duolingo, url, instagram, kine_master, inshot, minecraft, gameUrl, dream, clash, sendMessage);
            } else {
                //agar foydalanuvchi yangi bo'lsa malumotlar so'raladi
                String firstName = update.getMessage().getChat().getFirstName();
                String state = stateMap.getOrDefault(chatId, "start");
                registratsiya(chatId);
                Regis(state, chatId, text, firstName);
            }*/

        } else if (update.hasCallbackQuery()) {
            Long chatId = update.getCallbackQuery().getMessage().getChatId();
            String data = update.getCallbackQuery().getData();
            SendVideo sendVideo = new SendVideo();
            sendVideo.setChatId(chatId);
            AllData(data, sendVideo, chatId);
        } else if (update.hasMessage() && update.getMessage().hasContact()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String number = text;
            userNumbers.put(chatId, number);
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Raxmat malumotlar qabul qilindi \nIltimos qaytadan Kirish bosib kiring!");
            try {
                execute(sendMessage);
                MainMainManuu(chatId);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @NotNull
    private void MainMainManuu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Salom Xush kelibsiz");
        ReplyKeyboardRemove replyKeyboardRemove = new ReplyKeyboardRemove();
        replyKeyboardRemove.setRemoveKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardRemove);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos Tanlang");
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Kirish\uD83C\uDF10");
        button1.setCallbackData("kirish");
        row1.add(button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton("Ro'yhatdan o'tish\uD83C\uDF10");
        button2.setCallbackData("royhatdan_o'tish");
        row1.add(button2);
        rowList.add(row1);
        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



    private void Regis(String state, Long chatId, String text, String firstName) {
        if (state.equals("start")) {
            //sendMessage(chatId, "Ismingizni kiriting!");
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Ismingizni kiriting!");
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowListIsm = new ArrayList<>();
            KeyboardRow rowIsm = new KeyboardRow();
            rowIsm.add(new KeyboardButton(firstName));
            rowListIsm.add(rowIsm);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setKeyboard(rowListIsm);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            stateMap.put(chatId, "gender");
        } else if (state.equals("gender")) {
            firstNameMap.put(chatId, firstName);
            //sendMessage(chatId, "Jinsingizni kiriting (Erkak / Ayol)!");
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Jinsingizni Tanlang");
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add(new KeyboardButton("Erkak"));
            row.add(new KeyboardButton("Ayol"));
            rowList.add(row);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setKeyboard(rowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            stateMap.put(chatId, "finish");
        } else if (state.equals("finish")) {
            genderMap.put(chatId, text);
            //sendMessage(chatId, "Rahmat! Ma'lumotlaringiz qabul qilindi. Botni qayta ishga tushiring\n\n                    /start");
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Rahmat! Ma'lumotlaringiz qabul qilindi. Botni qayta ishga tushiring!\n\n           /start");
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add(new KeyboardButton("/start"));
            rowList.add(row);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setKeyboard(rowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            // saqlangan malumotlarni ko'rsatish
            System.out.println("Ism: " + firstNameMap.get(chatId));
            System.out.println("Jinsi: " + genderMap.get(chatId));

            // state mapni tizalash
            stateMap.remove(chatId);
        }
    }

    private void AllText(String text, Long chatId, SendDocument sendDocument, String duolingo, String url, String instagram, String kine_master, String inshot, String minecraft, String gameUrl, String dream, String clash, SendMessage sendMessage) {
        if (text.equals("/start")) {
            try {
                execute(myBotService.AsosiyMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } /*else if (text.equals("Video Download🔻")) {
            // Foydalanuvchidan video URL-sini so'rash
            SendMessage requestMessage = new SendMessage();
            requestMessage.setChatId(chatId);
            requestMessage.setText("Iltimos, video URL-sini kiriting:");
            execute(requestMessage);

            // Keyingi bosqichda foydalanuvchining javobini kutish
            // bu yerda 'update' dan URL olish
            // Misol uchun:
            String videoUrl = update.getMessage().getText();

            // Videoni yuklab olish jarayoni
            try {
                // Video URL ni tekshirib, yuklab olish
                downloadVideo(videoUrl);
                SendMessage successMessage = new SendMessage();
                successMessage.setChatId(chatId);
                successMessage.setText("Video muvaffaqiyatli yuklandi!");
                execute(successMessage);
            } catch (IOException e) {
                // Xatolik bo'lsa xabar yuborish
                SendMessage errorMessage = new SendMessage();
                errorMessage.setChatId(chatId);
                errorMessage.setText("Xatolik yuz berdi: " + e.getMessage());
                execute(errorMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/ else if (text.equals("\uD83D\uDCF1 Samsung!")) {
            try {
                execute(myBotService.SamSung(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCBB Pro Programmalar")) {
            try {
                execute(myBotService.ProApk(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83C\uDFAE Pro O'yinlar")) {
            try {
                execute(myBotService.ProGame(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCCDDuolingo Pro")) {
            sendDocument.setDocument(new InputFile(duolingo));
            sendDocument.setCaption(url);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("⬅\uFE0F Orqaga")) {
            try {
                execute(myBotService.mainMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCCDInstagram Pro")) {
            sendDocument.setDocument(new InputFile(instagram));
            sendDocument.setCaption(url);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCCDKineMaster Pro")) {
            sendDocument.setDocument(new InputFile(kine_master));
            sendDocument.setCaption(url);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCCDInshot Pro")) {
            sendDocument.setDocument(new InputFile(inshot));
            sendDocument.setCaption(url);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDD79Minecraft Mod")) {
            sendDocument.setDocument(new InputFile(minecraft));
            sendDocument.setCaption(gameUrl);
            sendDocument.setParseMode(ParseMode.HTML);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDD79Dream League Mod")) {
            sendDocument.setDocument(new InputFile(dream));
            sendDocument.setCaption(gameUrl);
            sendDocument.setParseMode(ParseMode.HTML);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDD79Clash of Clans Mod")) {
            sendDocument.setDocument(new InputFile(clash));
            sendDocument.setCaption(gameUrl);
            sendDocument.setParseMode(ParseMode.HTML);
            try {
                execute(sendDocument);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("⬅\uFE0f Orqaga1")) {
            try {
                execute(myBotService.SamSung(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("SamSung haqida malumot beradigan saytlar!")) {
            try {
                execute(myBotService.SamAbout(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDD04 SamSung rasmiy sahifalari!")) {
            try {
                execute(myBotService.rasmiy(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83C\uDF4F iPhone!")) {
            try {
                execute(myBotService.iPMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDD79 Pro Programmalar")) {

        } else if (text.equals("\uD83C\uDFAE Orginal Programmalar")) {
            try {
                execute(myBotService.orProg(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Duolingo: Language")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.duolingo&pcampaignid=web_share\">Duolingo</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Instagram")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.instagram.android&pcampaignid=web_share\">Instagram</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("KineMaster")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.nexstreaming.app.kinemasterfree&pcampaignid=web_share\">KineMaster</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Inshot")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.instashot.inshot&pcampaignid=web_share\">Inshot</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Telegram")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=org.telegram.messenger&pcampaignid=web_share\">Telegram</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("TikTok")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically&pcampaignid=web_share\">TikTok</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Spotify")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.spotify.music&pcampaignid=web_share\">Spotify</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Netflix")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.netflix.mediaclient&pcampaignid=web_share\">Netflix</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Adobe Lightroom")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.adobe.lrm&pcampaignid=web_share\">Adobe Lightroom</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Snapchat")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.snapchat.android&pcampaignid=web_share\">Snapchat</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Pinterest")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.pinterest&pcampaignid=web_share\">Pinterest</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("YouTube")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.youtube&pcampaignid=web_share\">YouTube</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Zoom")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=us.zoom.videomeetings&pcampaignid=web_share\">Zoom</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("WhatsApp")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.whatsapp&pcampaignid=web_share\">WhatsApp</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Amazon Shopping")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.amazon.mShop.android.shopping&pcampaignid=web_share\">Amazon Shopping</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Google Maps")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.apps.maps&pcampaignid=web_share\">Google Maps</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Uber")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ubercab&pcampaignid=web_share\">Uber</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Airbnb")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.airbnb.android&pcampaignid=web_share\">Airbnb</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Microsoft Office")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.microsoft.office.officehub&pcampaignid=web_share\">Microsoft Office</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Google Drive")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.apps.docs&pcampaignid=web_share\">Google Drive</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Dropbox")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.getdropbox.android&pcampaignid=web_share\">Dropbox</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Shazam")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.shazam.android&pcampaignid=web_share\">Shazam</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("SoundCloud")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.soundcloud.android&pcampaignid=web_share\">SoundCloud</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Viber")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.viber.voip&pcampaignid=web_share\">Viber</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Discord")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.discord&pcampaignid=web_share\">Discord</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Reddit")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.reddit.frontpage&pcampaignid=web_share\">Reddit</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Twitter")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.twitter.android&pcampaignid=web_share\">Twitter</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Facebook")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.facebook.katana&pcampaignid=web_share\">Facebook</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("LinkedIn")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.linkedin.android&pcampaignid=web_share\">LinkedIn</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Messenger")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.facebook.orca&pcampaignid=web_share\">Messenger</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Google Photos")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.apps.photos&pcampaignid=web_share\">Google Photos</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Canva")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.canva.editor&pcampaignid=web_share\">Canva</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("PicsArt")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.picsart.studio&pcampaignid=web_share\">PicsArt</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Grammarly")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.grammarly.android&pcampaignid=web_share\">Grammarly</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("PayPal")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.paypal.android.p2pmobile&pcampaignid=web_share\">PayPal</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("MyFitnessPal")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.myfitnesspal.android&pcampaignid=web_share\">MyFitnessPal</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Fitbit")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.fitbit.FitbitMobile&pcampaignid=web_share\">Fitbit</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Headspace")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.getsomeheadspace.android&pcampaignid=web_share\">Headspace</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Calm")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.calm.android&pcampaignid=web_share\">Calm</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Sleep Cycle")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.urbandroid.sleep&pcampaignid=web_share\">Sleep Cycle</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Strava")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.strava&pcampaignid=web_share\">Strava</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Nike Run Club")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.nike.plusgps&pcampaignid=web_share\">Nike Run Club</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Adobe Photoshop")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.adobe.photoshop&pcampaignid=web_share\">Adobe Photoshop</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("VSCO")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.vsco.cam&pcampaignid=web_share\">VSCO</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Facetune")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.lightricks.facetune&pcampaignid=web_share\">Facetune</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Google Keep")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.keep&pcampaignid=web_share\">Google Keep</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Evernote")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.evernote&pcampaignid=web_share\">Evernote</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Notion")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=notion.id&pcampaignid=web_share\">Notion</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Mint")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.mint&pcampaignid=web_share\">Mint</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Robinhood")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.robinhood.android&pcampaignid=web_share\">Robinhood</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Coinbase")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.coinbase.android&pcampaignid=web_share\">Coinbase</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Venmo")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.venmo&pcampaignid=web_share\">Venmo</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Zillow")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.zillow.android&pcampaignid=web_share\">Zillow</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("TradingView")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.tradingview.tradingviewapp&pcampaignid=web_share\">TradingView</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Coursera")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=org.coursera.android&pcampaignid=web_share\">Coursera</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Udemy")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.udemy.android&pcampaignid=web_share\">Udemy</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Khan Academy")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=org.khan.app.android&pcampaignid=web_share\">Khan Academy</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Google Translate")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.google.android.apps.translate&pcampaignid=web_share\">Google Translate</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("iTranslate")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=it.itranslate.client&pcampaignid=web_share\">iTranslate</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Waze")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.waze&pcampaignid=web_share\">Waze</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        } else if (text.equals("\uD83C\uDFAE Orginal O'yinlar")) {
            try {
                execute(myBotService.orGame(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("PUBG Mobile")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.tencent.ig&pcampaignid=web_share\">PUBG Mobile</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Call of Duty: Mobile")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.activision.callofduty.shooter&pcampaignid=web_share\">Call of Duty: Mobile</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Among Us")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.innersloth.spacemafia&pcampaignid=web_share\">Among Us</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Minecraft")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.mojang.minecraftpe&pcampaignid=web_share\">Minecraft</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Fortnite")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://www.epicgames.com/fortnite/en-US/mobile/android/get-started\">Fortnite</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Roblox")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.roblox.client&pcampaignid=web_share\">Roblox</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Genshin Impact")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.miHoYo.GenshinImpact&pcampaignid=web_share\">Genshin Impact</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Clash Royale")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.supercell.clashroyale&pcampaignid=web_share\">Clash Royale</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Candy Crush Saga")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.king.candycrushsaga&pcampaignid=web_share\">Candy Crush Saga</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Brawl Stars")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.supercell.brawlstars&pcampaignid=web_share\">Brawl Stars</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("League of Legends: Wild Rift")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.riotgames.league.wildrift&pcampaignid=web_share\">League of Legends: Wild Rift</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Arena of Valor")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ngame.allstar.eu&pcampaignid=web_share\">Arena of Valor</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("The Sims Mobile")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ea.gp.simsmobile&pcampaignid=web_share\">The Sims Mobile</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Subway Surfers")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.kiloo.subwaysurf&pcampaignid=web_share\">Subway Surfers</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Temple Run")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.imangi.templerun&pcampaignid=web_share\">Temple Run</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Angry Birds")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.rovio.angrybirdsclassic&pcampaignid=web_share\">Angry Birds</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Fruit Ninja")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.halfbrick.fruitninja&pcampaignid=web_share\">Fruit Ninja</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("World of Tanks Blitz")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=net.wargaming.wot.blitz&pcampaignid=web_share\">World of Tanks Blitz</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Fall Guys: Ultimate Knockout")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://store.epicgames.com/en-US/p/fall-guys\">Fall Guys: Ultimate Knockout</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("FIFA Mobile")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ea.gp.fifamobile&pcampaignid=web_share\">FIFA Mobile</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("NBA Live Mobile")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ea.gp.nbamobile&pcampaignid=web_share\">NBA Live Mobile</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Need for Speed: No Limits")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ea.game.nfs14&pcampaignid=web_share\">Need for Speed: No Limits</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Shadow Fight 3")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.nekki.shadowfight3&pcampaignid=web_share\">Shadow Fight 3</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Assassin's Creed: Rebellion")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.ubisoft.acrebellion&pcampaignid=web_share\">Assassin's Creed: Rebellion</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Arknights")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.yoastar.EN&pcampaignid=web_share\">Arknights</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Dragon Ball Legends")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.bandainamcoent.dragonnballlegends&pcampaignid=web_share\">Dragon Ball Legends</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Final Fantasy XV: Pocket Edition")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.squareenix.ffxv&pcampaignid=web_share\">Final Fantasy XV: Pocket Edition</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Honkai Impact 3rd")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.bh.honkaimpact3&pcampaignid=web_share\">Honkai Impact 3rd</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Monster Hunter Stories")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.capcom.monsterhunterstories&pcampaignid=web_share\">Monster Hunter Stories</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Terraria")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.reLogic.Terraria&pcampaignid=web_share\">Terraria</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Fallout Shelter")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.bethsoft.falloutshelter&pcampaignid=web_share\">Fallout Shelter</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Stardew Valley")) {
            sendMessage.setText("Mana sizga kerakli programma havolasi\n" + "<a href=\"https://play.google.com/store/apps/details?id=com.chucklefish.stardewvalley&pcampaignid=web_share\">Stardew Valley</a>\n");
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83C\uDFAE So'ngi versiya orginal O'yinlar")) {
            try {
                execute(myBotService.orGame(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("📰 So'nggi yangiliklar")) {
            String news = fetchLatestNews();
            sendMessage.setText(news);
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("🌤️ Ob-havo ma'lumotlari")) {
            sendMessage.setChatId(chatId);
            sendMessage.setText("Iltimos biroz kuting! Tahminiy kutish vaqti 10 sekunt");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            StringBuilder weatherBuilder = new StringBuilder("🌤️ O'zbekiston ob-havo ma'lumotlari:\n\n");
            for (String city : CITIES) {
                String weatherInfo = fetchWeather(city);
                weatherBuilder.append(weatherInfo).append("\n");
            }

            sendMessage.setText(weatherBuilder.toString());
            sendMessage.setParseMode(ParseMode.HTML);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCDA O'quv materiallari")) {
            try {
                execute(myBotService.material(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Java Darsliklari!\uD83D\uDCDA")) {
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();

            // 30 ta button inlineda chiqarish
            for (int i = 1; i <= 30; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("java_" + i);

                row.add(button);

                // 4 taroq chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            InlineKeyboardMarkup markup1 = new InlineKeyboardMarkup();
            markup1.setKeyboard(rows);

            SendMessage message1 = new SendMessage();
            message1.setChatId(chatId);
            message1.setText("Iltimos darsni tanlang!\uD83D\uDCDA");
            message1.setReplyMarkup(markup1);

            try {
                execute(message1);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("\uD83D\uDCCD Premium Xizmat!")) {
            sendMessage.setChatId(chatId);
            sendMessage.setText("Salom! \uD83D\uDE0A\n" +
                    "\n" +
                    "\uD83D\uDC49 Agar premium xizmatdan foydalanmoqchi bo'lsangiz va qaroringiz qat’iy bo'lsa, ushbu accountga murojaat qiling.\n" +
                    "\n" +
                    "⁉\uFE0F Premium xizmatda nimalar bor? Degan savolga ham accountga yozib, batafsil javob olishingiz mumkin.\n" +
                    "\n" +
                    "⭐\uFE0F Premium xizmat sizga albatta yoqadi! Murojaat qiling!\nhttps://t.me/asilbek_mustafoqulov ");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("⬅\uFE0F Orqaga4")) {
            try {
                execute(myBotService.AsosiyMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("MrAsilbek Bot\uD83D\uDD04")) {
            try {
                execute(myBotService.mainMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Yordam\uD83C\uDD98") || text.equals("/help")) {
            SendMessage sendMessage1 = new SendMessage();
            sendMessage1.setChatId(chatId);
            sendMessage1.setText("Salom! Yordam kerak bo‘lsa, adminga yozishingiz mumkin." +
                    " \nHar doim onlayn emas, lekin sizga imkon qadar tez javob beramiz!" +
                    " \nAdmin: @asilbek_mustafoqulov");
        } else if (text.equals("MrAsilbek Server\uD83D\uDD12")) {

        }


        /*else if (text.equals("Java Darsliklari!\uD83D\uDCDA")) {
            try {
                execute(myBotService.java_Dars(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Java Darsliklari! 1-5\uD83D\uDCDA")) {
            String[] videoUrls = {
                    "https://t.me/MrAsilbekSaved/16",
                    "https://t.me/MrAsilbekSaved/18",
                    "https://t.me/MrAsilbekSaved/19",
                    "https://t.me/MrAsilbekSaved/20",
                    "https://t.me/MrAsilbekSaved/21"
            };

            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);

                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (text.equals("Java Darsliklari! 5-10\uD83D\uDCDA")) {
            String[] videoUrls = {
                    "https://t.me/MrAsilbekSaved/22",
                    "https://t.me/MrAsilbekSaved/23",
                    "https://t.me/MrAsilbekSaved/24",
                    "https://t.me/MrAsilbekSaved/25",
                    "https://t.me/MrAsilbekSaved/26",
            };
            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);
                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (text.equals("Java Darsliklari! 10-15\uD83D\uDCDA")) {
            String[] videoUrls = {
                    "https://t.me/MrAsilbekSaved/27",
                    "https://t.me/MrAsilbekSaved/28",
                    "https://t.me/MrAsilbekSaved/29",
                    "https://t.me/MrAsilbekSaved/30",
                    "https://t.me/MrAsilbekSaved/31",
            };
            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);

                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (text.equals("Java Darsliklari! 15-20\uD83D\uDCDA")) {
            String [] videoUrls = {
                    "https://t.me/MrAsilbekSaved/32",
                    "https://t.me/MrAsilbekSaved/33",
                    "https://t.me/MrAsilbekSaved/34",
                    "https://t.me/MrAsilbekSaved/35",
                    "https://t.me/MrAsilbekSaved/36",

            };
            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);

                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (text.equals("Java Darsliklari! 20-25\uD83D\uDCDA")) {
            String[] videoUrls = {
                    "https://t.me/MrAsilbekSaved/37",
                    "https://t.me/MrAsilbekSaved/38",
                    "https://t.me/MrAsilbekSaved/39",
                    "https://t.me/MrAsilbekSaved/40",
                    "https://t.me/MrAsilbekSaved/41",
            };
            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);

                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (text.equals("Java Darsliklari! 25-30\uD83D\uDCDA")) {
            String[] videoUrls = {
                    "https://t.me/MrAsilbekSaved/42",
                    "https://t.me/MrAsilbekSaved/43",
                    "https://t.me/MrAsilbekSaved/44",
                    "https://t.me/MrAsilbekSaved/45",
                    "https://t.me/MrAsilbekSaved/46",
            };
            for (String videoUrl : videoUrls) {
                SendVideo sendVideo = new SendVideo();
                sendVideo.setChatId(chatId);
                sendVideo.setVideo(new InputFile(videoUrl));
                sendVideo.setCaption(urlJava);
                sendVideo.setParseMode(ParseMode.HTML);

                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }*/

        else if (text.equals("⬅\uFE0F Orqaga2")) {
            try {
                execute(myBotService.mainMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Asosiy Menuga qaytish!\uD83C\uDFD8")) {
            try {
                execute(myBotService.mainMenu(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("⬅\uFE0F Orqaga3")) {
            try {
                execute(myBotService.material(chatId));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Java Telegram Bot!\uD83E\uDD16")) {
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();

            // 21 ta button chiqarish inlineda
            for (int i = 1; i <= 21; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("darsjava" + i);

                row.add(button);

                // 4 qator qilib chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            // pasda telegram bot proni chiqarish
            List<InlineKeyboardButton> lastRow = new ArrayList<>();
            InlineKeyboardButton proButton = new InlineKeyboardButton();
            proButton.setText("Telegram Bot PRO📚");
            proButton.setCallbackData("proBot");

            lastRow.add(proButton);
            rows.add(lastRow);

            InlineKeyboardMarkup markup1 = new InlineKeyboardMarkup();
            markup1.setKeyboard(rows);

            SendMessage message1 = new SendMessage();
            message1.setChatId(chatId);
            message1.setText("Iltimos darsni tanlang!\uD83D\uDCDA");
            message1.setReplyMarkup(markup1);

            try {
                execute(message1);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Ingliz tilini 0 dan o'rganish\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F")) {
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();

            // birinchi 100 ta qatorni chiqarish
            for (int i = 1; i <= 100; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("video_" + i);

                row.add(button);

                // 4 taqor chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            InlineKeyboardMarkup markup1 = new InlineKeyboardMarkup();
            markup1.setKeyboard(rows);

            SendMessage message1 = new SendMessage();
            message1.setChatId(chatId);
            message1.setText("Iltimos darsni tanlang!\uD83D\uDCDA (1-100):");
            message1.setReplyMarkup(markup1);

            try {
                execute(message1);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            // qolgan 76 +
            rows = new ArrayList<>();
            row = new ArrayList<>();

            for (int i = 101; i <= 176; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("video_" + i);

                row.add(button);

                // 4 button chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            InlineKeyboardMarkup markup2 = new InlineKeyboardMarkup();
            markup2.setKeyboard(rows);

            SendMessage message2 = new SendMessage();
            message2.setChatId(chatId);
            message2.setText("Iltimos darsni tanlang!\uD83D\uDCDA (101-176):");
            message2.setReplyMarkup(markup2);

            try {
                execute(message2);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (text.equals("Rus tilini 0 dan o'rganish\uD83C\uDDF7\uD83C\uDDFA")) {
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();

            // 100 ta button chiqarish
            for (int i = 1; i <= 100; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("darslar_" + i);

                row.add(button);

                // 4 qator chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            InlineKeyboardMarkup markup1 = new InlineKeyboardMarkup();
            markup1.setKeyboard(rows);

            SendMessage message1 = new SendMessage();
            message1.setChatId(chatId);
            message1.setText("Iltimos darsni tanlang!\uD83D\uDCDA (1-100):");
            message1.setReplyMarkup(markup1);

            try {
                execute(message1);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            // qolgan 8 +
            rows = new ArrayList<>();
            row = new ArrayList<>();

            for (int i = 101; i <= 108; i++) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(i + "-Dars");
                button.setCallbackData("darslar_" + i);

                row.add(button);

                // 4 taroq qilib chiqarish
                if (i % 4 == 0) {
                    rows.add(row);
                    row = new ArrayList<>();
                }
            }

            if (!row.isEmpty()) {
                rows.add(row);
            }

            InlineKeyboardMarkup markup2 = new InlineKeyboardMarkup();
            markup2.setKeyboard(rows);

            SendMessage message2 = new SendMessage();
            message2.setChatId(chatId);
            message2.setText("Iltimos darsni tanlang!\uD83D\uDCDA (101-176):");
            message2.setReplyMarkup(markup2);

            try {
                execute(message2);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private void AllData(String data, SendVideo sendVideo, Long chatId) {
        String loginBack = "loginBack";
        if (data.equals("darsjava1")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/47"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava2")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/48"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava3")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/49"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava4")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/50"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava5")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/51"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava6")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/52"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava7")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/53"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava8")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/54"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava9")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/55"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava10")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/56"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava11")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/57"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava12")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/58"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava13")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/59"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava14")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/60"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava15")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/61"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava16")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/62"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava17")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/63"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava18")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/64"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava19")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/65"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava20")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/66"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("darsjava21")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/67"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("proBot")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/68"));
            sendVideo.setCaption(urlBotProgramming);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_1")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/16"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_2")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/18"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_3")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/19"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_4")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/20"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_5")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/21"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_6")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/22"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_7")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/23"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_8")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/24"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_9")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/25"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_10")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/26"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_11")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/27"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_12")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/28"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_13")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/29"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_14")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/30"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_15")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/31"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_16")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/32"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_17")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/33"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_18")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/34"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_19")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/35"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_20")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/36"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_21")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/37"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_22")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/38"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_23")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/39"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_24")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/40"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_25")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/41"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_26")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/42"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_27")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/43"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_28")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/44"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_29")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/45"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.equals("java_30")) {
            sendVideo.setVideo(new InputFile("https://t.me/MrAsilbekSaved/46"));
            sendVideo.setCaption(urlJava);
            sendVideo.setParseMode(ParseMode.HTML);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (data.startsWith("video_")) {
            int videoNumber = getVideoNumber(data);
            if (videoNumber > 0) {
                sendVideo.setVideo(new InputFile(generateVideoUrl(videoNumber)));
                sendVideo.setCaption(urlEnglish);
                sendVideo.setParseMode(ParseMode.HTML);
                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (data.startsWith("darslar_")) {
            int videoNumber = getVideoNumber2(data);
            if (videoNumber > 0) {
                sendVideo.setVideo(new InputFile(generateVideoUrl2(videoNumber)));
                sendVideo.setCaption(urlRussianUz);
                sendVideo.setParseMode(ParseMode.HTML);
                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        } else if (data.equals("kirish")) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Iltimos loginni kiriting!");
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();
            InlineKeyboardButton button = new InlineKeyboardButton("⬅\uFE0F Orqaga");
            button.setCallbackData(loginBack);
            row.add(button);
            rowList.add(row);
            inlineKeyboardMarkup.setKeyboard(rowList);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            stateMap.put(chatId, "login");
        } else if (data.equals("royhatdan_o'tish")) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Iltimos Login kiriting!!! \n\n'LOGIN VA PAROLNI ESLAB QOLING PROFILGA KIRISH UCHUN'");
            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
            List<InlineKeyboardButton> row = new ArrayList<>();
            InlineKeyboardButton button = new InlineKeyboardButton("⬅\uFE0F Orqaga");
            button.setCallbackData(loginBack);
            row.add(button);
            rowList.add(row);
            inlineKeyboardMarkup.setKeyboard(rowList);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            stateMap.put(chatId, "sendLogin");
        } else if (data.equals(loginBack)) {
            MainMainManuu(chatId);
        }
    }

    private int getVideoNumber(String data) {
        try {
            return Integer.parseInt(data.substring(6));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1; // Noto'g'ri format bo'lsa, -1 qaytaradi
        }
    }

    private int getVideoNumber2(String data) {
        try {
            return Integer.parseInt(data.substring(8));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1; // Noto'g'ri format bo'lsa, -1 qaytaradi
        }
    }

    private String generateVideoUrl(int videoNumber) {
        int baseId = 244; // `https://t.me/MrAsilbekSaved/245` dan boshlangani uchun `244`
        return "https://t.me/MrAsilbekSaved/" + (baseId + videoNumber);
    }

    private String generateVideoUrl2(int videoNumber) {
        int baseId = 529; // `https://t.me/MrAsilbekSaved/530` dan boshlangani uchun `529`
        return "https://t.me/MrAsilbekSaved/" + (baseId + videoNumber);
    }


    private void sendMessage(Long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "MrAsilbekChannelBot";
    }

    @Override
    public String getBotToken() {
        return "7637915691:AAHYsc-krBGaqb6PAVu2OJllu-kwM4x47Bk";
    }
}
