Feature:Class Calismasi

  Scenario Outline:
When kullanici https://editor.datatables.net/ adresine gider
Then new butonuna basar
And  isim bolumune "<first name>" girer
And soy isim bolumune "<last name>" bilgisi girer
And ofis bolumune "<ofis bilgisi>" girer
And extension bolumune "<extension>" girer
And start date bolumune "<Start date>" girer
And salary bolumune "<Salary>" girer
And Create tusuna basar
When kullanici "<first name>" ile arama yapar
Then isim bolumunde "<first name>" oldugunu dogrular
    Examples:
      | first name | last name | ofis bilgisi | extention | Start date | Salary |
      | Ali        | Tut       | QA           | Google    | 2022-10-12 | 1500   |
      | Veli       | Ak        | QA           | Google    | 2022-10-12 | 1800   |
      | Cem        | Al        | Dev          | Apple     | 2022-10-12 | 2500   |
      | Alp        | Pek       | Dev          | Applee    | 2022-10-12 | 2000   |
      | Cenk       | Ar        | QA           | Amazon    | 2022-10-12 | 1900   |

    #5 farkli kullanici bilgisi girer
