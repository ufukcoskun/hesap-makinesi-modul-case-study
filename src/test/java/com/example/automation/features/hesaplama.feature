Feature: Hesaplama Modülü Senaryoları

  @KısaVadeliYatırım
  Scenario: Kısa Vadeli Yatırım Hesaplaması
    Given Hesaplama Modülü sayfası açılır
    When Yatırım tutarı alanına tıklanır
    Then Yatırım tutarı "500" TL olarak girilir
    When Faiz oranı alanına tıklanır
    Then Faiz oranı %"3" olarak girilir
    When Süre alanına tıklanır
    Then Süre "6" ay olarak girilir
    Then Hesapla butonuna tıklanır
    Then Kısa vadeli yatırım sonucu "507" TL olarak görülür

  @YillikYatirim
  Scenario:  Yıllık Yatırım Hesaplaması
    Given Hesaplama Modülü sayfası açılır
    When Yıllık yatırım tutarı alanına tıklanır
    Then Yıllık yatırım tutarı "200" TL olarak girilir
    When Yıllık faiz oranı alanına tıklanır
    Then Yıllık faiz oranı %"4" olarak girilir
    Then Hesapla butonuna tıklanır
    Then Yıllık yatırım sonucu "208" TL olarak görülür
