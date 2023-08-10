# Purchasing platform project

# Spis treści

1. [O projekcie](#o-projekcie)
2. [Opis domeny](#opis-domeny)

## O projekcie

Ten projekt będzie próbował odzwierciedlić przykładowy portal zakupowy, jakim jest np. Allegro. Będzie się opierał o wymagania, które będę się starał na bieżąco dostarczać w [Miro](https://miro.com/app/board/uXjVMvVXtes=/). Nie będzie to zwykła aplikacja. Będę się w niej starał korzystać z technik takie jak Domain Driven Design, Event Storming, Event Sourcing, Behaviour-Driven Development i wiele, wiele innych.

## Opis domeny

Portal zakupowy pozwala na wystawianie swoich produktów przez wielu sprzedawców, aby kupujący użytkownicy mogli je kupić. Każdy sprzedawca będzie mógł dodawać oraz usuwać produkty. Produkty będą mogły być udostępniane do sprzedaży oraz z niej wycofywane. Natomiast na początku będzie musiał się na tym portalu zarejestrować. Żeby to uczynić niezbędne będzie uzupełnienie formularza. Następnie odbędzie się proces weryfikacji przez administratora czy można takiego sprzedawcę zarejestrować w portalu. Dopiero wtedy uzyska pełny dostęp do aplikacji. Początkowo będzie można udostępnić tylko 10 produktów do sprzedaży w ramach pakietu Free. Dodatkowo żaden z nich nie może być droższy niż 1000zł. Dopiero pakiet Standard zwiększa ilość produktów do 25 i zwiększa limit na 10000zł. Dostępny będzie też pakiet Premium, on będzie pozwalał na 100 produktów w limicie 100000zł. Większe ilości i kwoty mogą zostać ustalone indywidualnie. Cały model będzie opierał się na subskrypcji - miesięcznej lub rocznej. Ważne założenie, ilość dodanych produktów jest nielimitowana natomiast udostępnianie do sprzedaży już jest.

| Pakiet     | Ilość dostępnych produktów   | Maksymalna cena za produkt   | Cena za miesiąc   | Cena za rok   |
|------------|------------------------------|------------------------------|-------------------|---------------|
| Free       | 10                           | 1000zł                       | 0zł               | 0zł           |
| Standard   | 25                           | 10000zł                      | 25zł              | 200zł         |
| Premium    | 100                          | 100000zł                     | 50zł              | 500zł         |

\* wyższe limity ustalane indywidualnie

Prowizja od sprzedaży za produkty do 1000zł wynosi 10%.
Prowizja od sprzedaży za produkty do 10000zł wynosi 15% od nadwyżki ponad 1000zł.
Prowizja od sprzedaży za produkty do 100000zł wynosi 20% od nadwyżki ponad 10000zł.

Kupujący mogą kupować produkty wystawione przez sprzedawców. Mogą tego dokonywać bez rejestracji lub poprzez zarejestowanie się. Brak rejestracji skutkuje tym, że:
- można kupować produkty
- brak wsparcia platformy podczas reklamacji
- brak komunikacji ze sprzedawcą przez platformę
- brak śledzenia przesyłki przez platformę

Rejestracja pozwala na powyższe ograniczenia oraz:
- pozwala zapisać adres dostawy
- pozwala zapisać kartę kredytową
- pozwala dodawać produkty do ulubionych