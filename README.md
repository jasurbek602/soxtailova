# PoyApp

Android ilova uchun boshlang'ich loyiha (poydevor). Kotlin + Gradle asosida qurilgan.

## Nima tayyor?

- Kirish (Entry) ekrani — `MainActivity.kt` va `activity_main.xml`
- Ekranda bitta tugma ("Kirish") — bosilganda hozircha Toast xabar chiqadi
- GitHub Actions workflow (`.github/workflows/android-build.yml`) — har push'da avtomatik APK yasaydi

## GitHub'ga yuklash va APK olish

1. Ushbu papkani GitHub'dagi yangi repositoryga yuklang:
   ```bash
   git init
   git add .
   git commit -m "Boshlang'ich loyiha"
   git branch -M main
   git remote add origin https://github.com/USERNAME/REPO_NAME.git
   git push -u origin main
   ```
2. GitHub repo sahifasida **Actions** bo'limiga o'ting — workflow avtomatik ishga tushadi.
3. Workflow tugagach, o'sha ishga tushgan run sahifasida pastroqda **Artifacts** bo'limidan
   `app-debug-apk` faylini yuklab oling — bu sizning APK faylingiz.

## Loyihani davom ettirish

- Yangi ekran qo'shish: `app/src/main/java/com/example/poyapp/` ichiga yangi Activity/Fragment yozing.
- Tugma bosilganda boshqa ekranga o'tish uchun `MainActivity.kt` dagi
  `btnEnter.setOnClickListener { ... }` ichiga `startActivity(...)` qo'shing.
- Ranglar: `res/values/colors.xml`
- Matnlar: `res/values/strings.xml`
- Ilova nomi va package: `app/build.gradle` dagi `applicationId` va `namespace`

## Android Studio'da ochish

Bu loyiha standart Gradle strukturasida, shuning uchun Android Studio'da
"Open" orqali to'g'ridan-to'g'ri ochsa bo'ladi — Studio o'zi kerakli
`gradlew` fayllarini generatsiya qilib beradi (agar mavjud bo'lmasa).
