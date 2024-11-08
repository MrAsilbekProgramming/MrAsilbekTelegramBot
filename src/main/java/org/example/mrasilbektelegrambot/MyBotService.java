package org.example.mrasilbektelegrambot;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendGame;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage AsosiyMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Salom Xush kelibsiz iltimos tanlang!");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("MrAsilbek Server\uD83D\uDD12"));
        row1.add(new KeyboardButton("MrAsilbek Bot\uD83D\uDD04"));
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("MrAsilbek sms hizmati\uD83D\uDCF1"));
        row2.add(new KeyboardButton("MrAsilbek Market\uD83C\uDFEA"));
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Yordam\uD83C\uDD98"));
        row3.add(new KeyboardButton("Botga ishga kirish\uD83D\uDC68\u200D\uD83D\uDCBB"));
        rowList.add(row3);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage mainMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos tanlang!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // 1-qator tugmalari
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83D\uDCF1 Samsung!");
        row1.add(button1);
        /*KeyboardButton button2 = new KeyboardButton("\uD83D\uDCCA Statistika");
        row1.add(button2);*/
        KeyboardButton button3 = new KeyboardButton("\uD83C\uDF4F iPhone!");
        row1.add(button3);
        rowList.add(row1);

        // 2-qator tugmalari
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton("\uD83D\uDCF0 So'nggi yangiliklar");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton("\uD83C\uDF24\uFE0F Ob-havo ma'lumotlari");
        row2.add(button5);
        KeyboardButton button6 = new KeyboardButton("\uD83D\uDCDA O'quv materiallari");
        row2.add(button6);
        rowList.add(row2);

        // 3-qator tugmalari
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton("⏩ Dasturlar yoki o'yinlar haqida");
        row3.add(button7);
        KeyboardButton button8 = new KeyboardButton("\uD83D\uDCCD Premium Xizmat!");
        row3.add(button8);
        KeyboardButton button9 = new KeyboardButton("⚙\uFE0F Sozlamalar");
        row3.add(button9);
        rowList.add(row3);

        // 4-qator tugmasi
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("⬅\uFE0F Orqaga4"));
        rowList.add(row4);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage SamSung(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kerakli Menuga kirish uchun bosing!\uD83E\uDEF5\uD83C\uDFFB");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83D\uDCBB Pro Programmalar");
        row1.add(button1);
        KeyboardButton button2 = new KeyboardButton("\uD83C\uDFAE Pro O'yinlar");
        row1.add(button2);
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDD04 SamSung rasmiy sahifalari!");
        row1.add(button3);
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton("\uD83C\uDFAE Orginal Programmalar");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton("\uD83C\uDFAE Orginal O'yinlar");
        row2.add(button5);
        KeyboardButton button6 = new KeyboardButton("\uD83C\uDFAE So'ngi versiya orginal O'yinlar");
        row2.add(button6);
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton("SamSung haqida malumot beradigan saytlar!");
        row3.add(button7);
        rowList.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton("⬅\uFE0F Orqaga");
        row4.add(button8);
        rowList.add(row4);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage ProApk(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCBB Pro Programmalardan tanlang!");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83D\uDCCDDuolingo Pro");
        row1.add(button1);
        KeyboardButton button2 = new KeyboardButton("\uD83D\uDCCDInstagram Pro");
        row1.add(button2);
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDCCDKineMaster Pro");
        row1.add(button3);
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton("\uD83D\uDCCDInshot Pro");
        row2.add(button4);
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton("⬅\uFE0f Orqaga1");
        row3.add(button5);
        rowList.add(row3);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage ProGame(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCBB Pro O'yinlardan tanlang!");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83D\uDD79Minecraft Mod");
        row1.add(button1);
        KeyboardButton button2 = new KeyboardButton("\uD83D\uDD79Dream League Mod");
        row1.add(button2);
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDD79Clash of Clans Mod");
        row1.add(button3);
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton("⬅\uFE0F Orqaga1");
        row2.add(button4);
        rowList.add(row2);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage SamAbout(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDD0D Samsung haqida eng yaxshi ma'lumotlar uchun saytlar:\n" +
                "\n" +
                "\uD83C\uDF10 Samsung Rasmiy Sayti\n" +
                "\uD83D\uDCCC Samsung mahsulotlari, yangiliklar va texnologiyalar haqida to‘liq ma'lumot olish uchun rasmiy sayt.\n" +
                "\uD83D\uDD17 www.samsung.com\n" +
                "\n" +
                "\uD83D\uDCF0 Samsung Newsroom\n" +
                "\uD83D\uDCCC Samsung kompaniyasining eng so‘nggi yangiliklari va texnologik yangilanishlari bilan tanishing.\n" +
                "\uD83D\uDD17 news.samsung.com\n" +
                "\n" +
                "\uD83D\uDCF1 GSMArena - Samsung Bo'limi\n" +
                "\uD83D\uDCCC Samsung smartfonlari va gadjetlari haqida texnik tavsiflar, sharhlar va foydalanuvchi baholari.\n" +
                "\uD83D\uDD17 www.gsmarena.com\n" +
                "\n" +
                "\uD83D\uDD27 SamMobile\n" +
                "\uD83D\uDCCC Samsung smartfonlariga yangilanishlar, firmware fayllari va so'nggi yangiliklar haqida batafsil.\n" +
                "\uD83D\uDD17 www.sammobile.com\n" +
                "\n" +
                "\uD83D\uDCF2 Android Authority - Samsung Yangiliklari\n" +
                "\uD83D\uDCCC Samsung texnologiyalari va gadjetlari haqida maqolalar, sharhlar va yangiliklarni o‘qing.\n" +
                "\uD83D\uDD17 www.androidauthority.com");
        return sendMessage;
    }

    public SendMessage rasmiy(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCFA YouTube:\n" +
                "<a href=\"https://www.youtube.com/user/SamsungMobile\">Samsung Global</a>\n" +
                "<a href=\"https://www.youtube.com/user/Samsung\">Samsung Electronics</a>\n" +
                "\n" +
                "\uD83C\uDFB5 TikTok:\n" +
                "<a href=\"https://www.tiktok.com/@samsung\">Samsung Global</a>\n" +
                "\n" +
                "\uD83C\uDFA5 Vimeo:\n" +
                "<a href=\"https://vimeo.com/samsungelectronics\">Samsung Electronics</a>\n" +
                "\n" +
                "\uD83D\uDCCC Pinterest:\n" +
                "<a href=\"https://www.pinterest.com/samsung/\">Samsung Global</a>\n" +
                "\n" +
                "\uD83D\uDCF8 Instagram:\n" +
                "<a href=\"https://www.instagram.com/samsung/\">Samsung Global</a>\n" +
                "\n" +
                "\uD83D\uDCD8 Facebook:\n" +
                "<a href=\"https://www.facebook.com/SamsungElectronics\">Samsung Electronics</a>\n" +
                "\n" +
                "\uD83D\uDC26 Twitter:\n" +
                "<a href=\"https://twitter.com/SamsungMobile\">Samsung Mobile Global</a>\n" +
                "<a href=\"https://twitter.com/SamsungNewsroom\">Samsung Newsroom</a>\n" +
                "\n" +
                "\uD83C\uDDE8\uD83C\uDDF3 Weibo (Xitoy bozori uchun):\n" +
                "<a href=\"https://weibo.com/samsungelectronics\">Samsung Electronics</a>\n" +
                "\n" +
                "\uD83D\uDC65 Reddit:\n" +
                "<a href=\"https://www.reddit.com/r/samsung/\">Samsung Community</a>\n" +
                "\n" +
                "❓ Quora:\n" +
                "<a href=\"https://www.quora.com/q/samsung\">Samsungning Quora Space</a>\n" +
                "\n" +
                "\uD83D\uDC7B Snapchat:\n" +
                "Snapchatda \"Samsung\" nomi bilan qidirib topishingiz mumkin.\n" +
                "\n" +
                "✈\uFE0F Telegram:\n" +
                "Telegramda \"Samsung\" nomi bilan qidirib, hududingizdagi kanalni topishingiz mumkin.\n"
        );
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    public SendMessage iPMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kerakli Menuga kirish uchun bosing!\uD83E\uDEF5\uD83C\uDFFB");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83D\uDD79 Pro Programmalar");
        row1.add(button1);
        KeyboardButton button2 = new KeyboardButton("\uD83D\uDD79 Pro O'yinlar");
        row1.add(button2);
        KeyboardButton button3 = new KeyboardButton("\uD83D\uDD04 iPhona rasmiy sahifalari!");
        row1.add(button3);
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton("\uD83D\uDD79 Orginal Programmalar");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton("\uD83D\uDD79 Orginal O'yinlar");
        row2.add(button5);
        KeyboardButton button6 = new KeyboardButton("\uD83D\uDD79 So'ngi versiya orginal O'yinlar");
        row2.add(button6);
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton("iPhone haqida malumot beradigan saytlar!");
        row3.add(button7);
        rowList.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton("⬅\uFE0F Orqaga");
        row4.add(button8);
        rowList.add(row4);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage orProg(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83C\uDFAE Orginal Programmalardan tanlang!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton("⬅\uFE0F Orqaga1");
        row.add(button);
        rowList.add(row);
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Duolingo: Language"));
        row1.add(new KeyboardButton("Instagram"));
        row1.add(new KeyboardButton("KineMaster"));
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Inshot"));
        row2.add(new KeyboardButton("Telegram"));
        row2.add(new KeyboardButton("TikTok"));
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Spotify"));
        row3.add(new KeyboardButton("Netflix"));
        row3.add(new KeyboardButton("Adobe Lightroom"));
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Snapchat"));
        row4.add(new KeyboardButton("Pinterest"));
        row4.add(new KeyboardButton("YouTube"));
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Zoom"));
        row5.add(new KeyboardButton("WhatsApp"));
        row5.add(new KeyboardButton("Amazon Shopping"));
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("Google Maps"));
        row6.add(new KeyboardButton("Uber"));
        row6.add(new KeyboardButton("Airbnb"));
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("Microsoft Office"));
        row7.add(new KeyboardButton("Google Drive"));
        row7.add(new KeyboardButton("Dropbox"));
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        row8.add(new KeyboardButton("Shazam"));
        row8.add(new KeyboardButton("SoundCloud"));
        row8.add(new KeyboardButton("Viber"));
        rowList.add(row8);

        KeyboardRow row9 = new KeyboardRow();
        row9.add(new KeyboardButton("Discord"));
        row9.add(new KeyboardButton("Reddit"));
        row9.add(new KeyboardButton("Twitter"));
        rowList.add(row9);

        KeyboardRow row10 = new KeyboardRow();
        row10.add(new KeyboardButton("Facebook"));
        row10.add(new KeyboardButton("LinkedIn"));
        row10.add(new KeyboardButton("Messenger"));
        rowList.add(row10);

        KeyboardRow row11 = new KeyboardRow();
        row11.add(new KeyboardButton("Google Photos"));
        row11.add(new KeyboardButton("Canva"));
        row11.add(new KeyboardButton("PicsArt"));
        rowList.add(row11);

        KeyboardRow row12 = new KeyboardRow();
        row12.add(new KeyboardButton("Grammarly"));
        row12.add(new KeyboardButton("PayPal"));
        row12.add(new KeyboardButton("MyFitnessPal"));
        rowList.add(row12);

        KeyboardRow row13 = new KeyboardRow();
        row13.add(new KeyboardButton("Fitbit"));
        row13.add(new KeyboardButton("Headspace"));
        row13.add(new KeyboardButton("Calm"));
        rowList.add(row13);

        KeyboardRow row14 = new KeyboardRow();
        row14.add(new KeyboardButton("Sleep Cycle"));
        row14.add(new KeyboardButton("Strava"));
        row14.add(new KeyboardButton("Nike Run Club"));
        rowList.add(row14);

        KeyboardRow row15 = new KeyboardRow();
        row15.add(new KeyboardButton("Adobe Photoshop"));
        row15.add(new KeyboardButton("VSCO"));
        row15.add(new KeyboardButton("Facetune"));
        rowList.add(row15);

        KeyboardRow row16 = new KeyboardRow();
        row16.add(new KeyboardButton("Google Keep"));
        row16.add(new KeyboardButton("Evernote"));
        row16.add(new KeyboardButton("Notion"));
        rowList.add(row16);

        KeyboardRow row17 = new KeyboardRow();
        row17.add(new KeyboardButton("Mint"));
        row17.add(new KeyboardButton("Robinhood"));
        row17.add(new KeyboardButton("Coinbase"));
        rowList.add(row17);

        KeyboardRow row18 = new KeyboardRow();
        row18.add(new KeyboardButton("Venmo"));
        row18.add(new KeyboardButton("Zillow"));
        row18.add(new KeyboardButton("TradingView"));
        rowList.add(row18);

        KeyboardRow row19 = new KeyboardRow();
        row19.add(new KeyboardButton("Coursera"));
        row19.add(new KeyboardButton("Udemy"));
        row19.add(new KeyboardButton("Khan Academy"));
        rowList.add(row19);

        KeyboardRow row20 = new KeyboardRow();
        row20.add(new KeyboardButton("Google Translate"));
        row20.add(new KeyboardButton("iTranslate"));
        row20.add(new KeyboardButton("Waze"));
        rowList.add(row20);
        KeyboardRow row21 = new KeyboardRow();
        row21.add(new KeyboardButton("⬅\uFE0F Orqaga1"));
        rowList.add(row21);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage orGame(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83C\uDFAE Orginal O'yinlardan tanlang!" +
                "\n\nBu O'yinlar Google Playdagi eng mashxur o'yinlar!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // hamma o'yinlar
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("⬅️ Orqaga1"));
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("PUBG Mobile"));
        row2.add(new KeyboardButton("Call of Duty: Mobile"));
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Among Us"));
        row3.add(new KeyboardButton("Minecraft"));
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Fortnite"));
        row4.add(new KeyboardButton("Roblox"));
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Genshin Impact"));
        row5.add(new KeyboardButton("Clash Royale"));
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("Candy Crush Saga"));
        row6.add(new KeyboardButton("Brawl Stars"));
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        row7.add(new KeyboardButton("League of Legends: Wild Rift"));
        row7.add(new KeyboardButton("Arena of Valor"));
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        row8.add(new KeyboardButton("The Sims Mobile"));
        row8.add(new KeyboardButton("Subway Surfers"));
        rowList.add(row8);

        KeyboardRow row9 = new KeyboardRow();
        row9.add(new KeyboardButton("Temple Run"));
        row9.add(new KeyboardButton("Angry Birds"));
        rowList.add(row9);

        KeyboardRow row10 = new KeyboardRow();
        row10.add(new KeyboardButton("Fruit Ninja"));
        row10.add(new KeyboardButton("World of Tanks Blitz"));
        rowList.add(row10);

        KeyboardRow row11 = new KeyboardRow();
        row11.add(new KeyboardButton("Fall Guys: Ultimate Knockout"));
        rowList.add(row11);

        KeyboardRow row12 = new KeyboardRow();
        row12.add(new KeyboardButton("FIFA Mobile"));
        row12.add(new KeyboardButton("NBA Live Mobile"));
        rowList.add(row12);

        KeyboardRow row13 = new KeyboardRow();
        row13.add(new KeyboardButton("Need for Speed: No Limits"));
        row13.add(new KeyboardButton("Real Racing 3"));
        rowList.add(row13);

        KeyboardRow row14 = new KeyboardRow();
        row14.add(new KeyboardButton("Shadow Fight 3"));
        row14.add(new KeyboardButton("Street Fighter IV Champion Edition"));
        rowList.add(row14);

        KeyboardRow row15 = new KeyboardRow();
        row15.add(new KeyboardButton("Assassin's Creed: Rebellion"));
        row15.add(new KeyboardButton("Arknights"));
        rowList.add(row15);

        KeyboardRow row16 = new KeyboardRow();
        row16.add(new KeyboardButton("Dragon Ball Legends"));
        row16.add(new KeyboardButton("Final Fantasy XV: Pocket Edition"));
        rowList.add(row16);

        KeyboardRow row17 = new KeyboardRow();
        row17.add(new KeyboardButton("Honkai Impact 3rd"));
        rowList.add(row17);

        KeyboardRow row18 = new KeyboardRow();
        row18.add(new KeyboardButton("Monster Hunter Stories"));
        rowList.add(row18);

        KeyboardRow row19 = new KeyboardRow();
        row19.add(new KeyboardButton("Terraria"));
        rowList.add(row19);

        KeyboardRow row20 = new KeyboardRow();
        row20.add(new KeyboardButton("Fallout Shelter"));
        row20.add(new KeyboardButton("Stardew Valley"));
        rowList.add(row20);

        KeyboardRow row21 = new KeyboardRow();
        row21.add(new KeyboardButton("⬅\uFE0F Orqaga1"));
        rowList.add(row21);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage material(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDAIltimos Menudan tanlang!");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅\uFE0F Orqaga2"));
        rowList.add(row);
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Java Darsliklari!\uD83D\uDCDA"));
        row1.add(new KeyboardButton("Java Telegram Bot!\uD83E\uDD16"));
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Ingliz tilini 0 dan o'rganish\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F"));
        row2.add(new KeyboardButton("Rus tilini 0 dan o'rganish\uD83C\uDDF7\uD83C\uDDFA"));
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Turk tilini 0 dan o'rganish\uD83C\uDDF9\uD83C\uDDF7"));
        row3.add(new KeyboardButton("Nemis tilini 0 dan o'rganish\uD83C\uDDE9\uD83C\uDDEA"));
        rowList.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Ispan tilini 0 dan o'rganish\uD83C\uDDEA\uD83C\uDDF8"));
        row4.add(new KeyboardButton("Xitoy tilini 0 dan o'rganish\uD83C\uDDE8\uD83C\uDDF3"));
        rowList.add(row4);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    /*public SendMessage java_Dars(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Java Darsliklari!\uD83D\uDCDA");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("Asosiy Menuga qaytish!\uD83C\uDFD8"));
        row.add(new KeyboardButton("⬅\uFE0F Orqaga3"));
        rowList.add(row);
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Java Darsliklari! 1-5\uD83D\uDCDA"));
        row1.add(new KeyboardButton("Java Darsliklari! 5-10\uD83D\uDCDA"));
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Java Darsliklari! 10-15\uD83D\uDCDA"));
        row2.add(new KeyboardButton("Java Darsliklari! 15-20\uD83D\uDCDA"));
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Java Darsliklari! 20-25\uD83D\uDCDA"));
        row3.add(new KeyboardButton("Java Darsliklari! 25-30\uD83D\uDCDA"));
        rowList.add(row3);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }*/
    /*public SendMessage java_TelegramBot(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Javada Telegram Bot! Yaratish\uD83D\uDCDA");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Asosiy Menuga qaytish!\uD83C\uDFD8"));
        row1.add(new KeyboardButton("⬅\uFE0F Orqaga3"));
        rowList.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Bot Darsliklari! 1-4\uD83D\uDCDA"));
        row2.add(new KeyboardButton("Bot Darsliklari! 4-8\uD83D\uDCDA"));
        rowList.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Bot Darsliklari! 8-12\uD83D\uDCDA"));
        row3.add(new KeyboardButton("Bot Darsliklari! 12-16\uD83D\uDCDA"));
        rowList.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Bot Darsliklari! 16-21\uD83D\uDCDA"));
        rowList.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Telegram Bot PRO\uD83D\uDCDA"));
        rowList.add(row5);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }*/
    public  SendMessage MainMainMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Salom xush kelibsiz iltimos menulardan birini tanlang!");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("\uD83C\uDFD8Oddiy Menu");
        row1.add(button1);

        return sendMessage;
    }

}
