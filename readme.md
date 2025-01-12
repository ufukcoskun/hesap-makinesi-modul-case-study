**Hesap Makinesi Modülü Otomasyon Projesi**

Bu proje, Selenium tabanlı bir web test otomasyonudur. Java ile yazılmıştır ve Sayfa Nesne Modeli (Page Object Model - POM) tasarım deseni kullanır. Google Chrome üzerinde çalışacak şekilde konfigüre edilmiştir ve Cucumber ile Davranış Odaklı Geliştirme (BDD) entegrasyonuna sahiptir. Bağımlılıklar Maven aracılığıyla yönetilir.

**Özellikler**

Tarayıcı Desteği: Google Chrome.

Tasarım Deseni: Sayfa Nesne Modeli (POM).

BDD Entegrasyonu: Cucumber ile test senaryolarını düz yazı formatında tanımlama.

Bağımlılık Yönetimi: Selenium, Cucumber ve ChromeDriver gibi bağımlıklar Maven ile yönetilir.

**Gereksinimler**

1. Yazılım Gereksinimleri

Java JDK: Sürüm 8 veya daha yenisi.

Apache Maven: En son kararlı sürüm.

Google Chrome: Kurulu ve güncel.


2. Ortam Değişkenleri

Testleri kolayca çalıştırmak için aşağıdaki ortam değişkenlerini ayarlayın:

JAVA_HOME: Java kurulum yolunu gösterir.

PATH: Maven ve ChromeDriver'ı sistem PATH'ine ekleyin.

Kurulum Talimatları

Depoyu Klonlayın:

git clone <repository-url>

cd selenium-java-bdd-framework

Bağımlılıkları İndirin:
Maven, pom.xml dosyasında listelenen tüm bağımlılıkları otomatik olarak indirecektir.

mvn clean install

**Sorun Giderme**

1. Bağımlılık Sorunları

Maven bağımlılıklarını indiremiyorsa, şunları deneyin:

mvn dependency:purge-local-repository
mvn clean install

2.Java Sürümü

Kullanılan Java sürümünün uyumlu olduğundan emin olun (8 veya daha yenisi).

java -version

3Test Hataları

Detaylı hata kayıtları için target/cucumber-reports dizininde oluşturulan raporları inceleyin.