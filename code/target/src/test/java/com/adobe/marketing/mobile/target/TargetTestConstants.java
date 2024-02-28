/*
  Copyright 2022 Adobe. All rights reserved.
  This file is licensed to you under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0
  Unless required by applicable law or agreed to in writing, software distributed under
  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
  OF ANY KIND, either express or implied. See the License for the specific language
  governing permissions and limitations under the License.
*/

package com.adobe.marketing.mobile.target;

import java.util.HashMap;

class TargetTestConstants {

    static final String LOG_TAG = TargetExtension.class.getSimpleName();
    static final String A4T_ACTION_NAME = "AnalyticsForTarget";
    static final String OLD_API_COMPAT_PARAM = "__oldTargetSdkApiCompatParam__";

    static final String API_URL_HOST_BASE = "%s.tt.omtrdc.net";
    static final String PREFETCH_API_URL_BASE =
            "https://%s/rest/v1/delivery/?client=%s&sessionId=%s";
    static final String REQUEST_CONTENT_TYPE = "application/json";

    // Target preview Constants
    static final String PREVIEW_MESSAGE_ID = "target-preview-message-id";
    static final String PREVIEW_PARAMETERS = "at_preview_params";
    static final String PREVIEW_TOKEN = "at_preview_token";
    static final String PREVIEW_ENDPOINT = "at_preview_endpoint";
    static final String PREVIEW_QA_MODE = "qaMode";
    static final String DEFAULT_TARGET_PREVIEW_ENDPOINT = "hal.testandtarget.omniture.com";
    static final String DEEPLINK = "deeplink";
    static final String DEEPLINK_SCHEME = "adbinapp";
    static final String DEEPLINK_SCHEME_PATH_CANCEL = "cancel";
    static final String DEEPLINK_SCHEME_PATH_CONFIRM = "confirm";
    static final String MBOX_AT_PROPERTY_KEY = "at_property";

    /** Base64 encoded button PNG */
    static final String ENCODED_BUTTON_BACKGROUND_PNG =
            "iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAYAAAA6/NlyAAAABGdBTUEAALGPC/xhBQAA"
                + "ACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAACXBIWXMAAAsTAAALEwEAmpwYAAABWWlUWHRYTUw6Y29tLm"
                + "Fkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iWE1QIENvcmUgNS40LjAiPgogICA"
                + "8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRl"
                + "c2NyaXB0aW9uIHJkZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczp0aWZmPSJodHRwOi8vbnMuYWRvYmUuY29tL3RpZmYvMS4wLyI+C"
                + "iAgICAgICAgIDx0aWZmOk9yaWVudGF0aW9uPjE8L3RpZmY6T3JpZW50YXRpb24+CiAgICAgIDwvcmRmOkRlc2NyaXB0aW9uPgogICA8L3J"
                + "kZjpSREY+CjwveDp4bXBtZXRhPgpMwidZAAAa4ElEQVRoBb1bB5gV1dn+Zub2e7dTlLoUKdI7iCiY34YB8xglMVGjKCAWFCuKBiVGTYwl"
                + "GI0CgmLvEfmjMUQQC1VC73WX3WXZwu7e3dvvzP++Z+5ddpdFNJL/PHvunJlTv/5955zV5P8naalp1POhhx5Sr6mnlapLP1Ov/51HeiGne"
                + "nSOqwEg/cwzz9Tr6ur0hhMcPHhQvXbs2LH+c+vWra3CwkJz6dKl5rvvvkvgzfrKU1g4lQArIF988UWjffv2+po1awwAnMRa48gEwEBWbV"
                + "JPPNR31rGdajN9+nQn+ovD4TArKyuTqTFYd0rSqQBYu+KKK/RRo0Y53G63MWXKlARWRupoN9xwQ+vbb7+9YyAQaO1yufI9Hk8rwzC8uq7"
                + "7kBNIoVgsVhuJRApQLtq/f3/JeeeddwB965BlxIgRTowtO3bsSMydOzeNlB8F/I8BmH11UMCZehJQeeutt/JHjhx5bm5u7hCn09kDAHYE"
                + "cFmo+s65LMsiAg6bprkXCNhcVFT0Va9evVajXzWyE5yjf/vtt/FTBTjG/N5JAQrMu5544gk/ehFg37p168bU1NQ8BYqtx+KrkGuQjyIfR"
                + "j6ksmkespABlHqyXF9nWUUoH0GuRg6iTTEA//jw4cO3zpkzpwvmoEh4AbgPTwfydyIQ9ackcRLjqaee8uLJ7Nq4ceN5tbW1C5LJZAEWWo"
                + "tcjkxACs1kkoARkOIGme/pfOw7AET7IrQvZN9UewJfAySuOXLkyIzHHnssn/M/99xzASIc5UbKEO+nNBFYx6JFi0hV1/jx49tUVFQ8DEAP"
                + "YFFB5BLkQkU1LB5lZgJG4IusZLIYTFtshsMliaLi0mR5+WEzHi/hN1XXsC36AvjiBsATiUFQ/AvI83jM70H2QZz4JNDfm9rft6E2aNAgx8"
                + "SJE90333xzZPny5QOGDx/+eyipEZiMVE1gIHtiTaNSsSSZ1OMHCxzRA/tdsVVrXMniEt0MBg2zNqhbRSWaFvBbWssWlh7IMLVAwHT27Z1w"
                + "9+8fdbdvF9dbtEgrKF0spaNMSxP8aT7OVVVVNQ864inMEwLQ1CNRlNnnlCRt8uTJTgwawGiOffv2XQGq7sLElM8CxbI2RRU14wWFR46+tK"
                + "C2dPLUWFHbrmYhgD/UKAesQ6d1tA5lt8F3o1Ed25Zc/NNE2cwHw7VL/3UU3EAuIYeQ2sVK9m1OqAmFQu/MmDEjH2typeSaMn7SdDIKK8r+"
                + "8pe/dN19991xaM6r27Rp8zuMSkUVAfYN0dQQpllW5ggu+cRfN/sxv3lgh/21U3eRTOApBlNMSqWziTK7aWAK9cSPA3qI5T1AT7hMGWXXtd"
                + "fHA5Mm1vqGDYuIYVjoDyIrDqLZy45Go6sWL15824QJE/YAaAdMIinNOsUWeB6XOMWJEuuoIDxg42hxcfH1p5122iOappF1YilgLYlGtZrF"
                + "HwfqnnzGn1z9ta617yJadpZlxeOaJNA0+QM4jWhygFAE3gAyNv/bBvy26bHsGyYGXb17EyAwNxGm0QwS6E1LliyZcvnll++GMjXuuOOOGL"
                + "6fcNLvYgMqKPekSZOiYOMr27Vr9ziBBXtRXklZC4rHqHhodk7ozuk+iWua3qUryahJJKopQG35w/w/IJkgUAKwkCtObyva6W3EXPyhEfrr"
                + "X33agIGWu0f3GOYm0DqeIXhkHTt37twPn5bPnDkzCNEzoGNOSOUTUVgHi3jAIrFt27aN7tGjxwIM6AawIBuUE4CN793nrLzz7pzERx84ZO"
                + "BQqC44R1ykzcw/AMKTN6WCsyIRTXZvE98Lc+tA7RrNAK2OUToH/vrf4dFNgcjF4Pgk4I+nXdpGE1CzNk3arbfe6gSwJryazl27dn0UwNIU"
                + "1bNxdNduV1nfUXkK2H6DRCqr4DGDKk2B5YK4MLLnyahNVm7aP7UyK1hrE6b/YKm7cbK/8vE/Zgs5ge0tC/wvVX6//6KjR4/eDtEzhw4dSh"
                + "3TLPceBzD94g4dOnAQ/corr7wL7mFPlOswsKHpupmsqDCq7p6RbYWKda3fYEuqgs0vlABCFq19xWJV18JyuqFO8K255HKJtbcYSDsBhxAw"
                + "6oOaWtEHD7PCD9zvrX719QwMZaWQRDjqsrKyboSdHg0FG4M8E2gbUQ3mbAqwNnbsWCc7oOP/gEVo5OkiOjiwFUtoxG5i8QcOrf9gOJA1mu"
                + "hNxuTidAwLylol5eL82fmid8kXa8dmkQx4haRMwwREWDs3i2PceaK1yBOJQuekx2jYjmUg0aqs1rQ+AyR47TWBuuVf0M008Z2LSIITXfn5"
                + "+begnPX6669ro0ePPo7KjQCmwF933XXsnI2ON+MJsoiJgfAAoV55OTP6pz+6tQFDjgc2zb5ueHxUOk4wSd0R0XKyJeueO0Ufc75YWzZgKZ"
                + "k20Bwz4Bdz+ybxPjRbfON+Kua/UU9O4FhEJMtNE+uicdHadpbqMZdlRXfvcQNBNFkErg7O0Nlg658j0IjedNNNpHIjGBu+aAjIycqxQ4cO"
                + "XYxwDpoIrGyaHMiK7tzpqps8ya/17CNWDWTKRgKqWEv2BUWPVIoFADQ3FhqJitazr0Rfmiehb1ZK1rRbxLhkvJibvgU6ETx5PWJuXi++WQ"
                + "+Lp18/qX1pAdALZBBQIgsKimMpbrFnOfYbAxe0yAE/V2o18+ZnqPm5nhSl8/LyroEeOh322YLT1IjK9QCnqCu9e/dugfRrUBUjYEyyJ1Lw"
                + "tTfoaYFVsZimtpUKBxpay/BLLoDz3XeXmAd2YeFO0c/sJ5E//UHqFi+WzKlTxH3TLWJuXCfm1g3if+RRcffpLdWzHxFz5VeidWlrszRkPv"
                + "eLFeL/8xzI9nb4UiRUg8SlQZ6l9wCJPfEHd2jVagYylBUuNgRi9b7//vvHoRyHhSERCYtKfGHS4JsSE4l33nmnDzoMQDkEd04pqvC6b72R"
                + "R2Z7NCxeQmG0ru/Pvja19mwX/2N/EN+I4aKDwliOjZhwRPQ+AyW68CUxq6olcNWvRM/OEaNVSzEyM6R66u1ildWIGhtIs8qqxRjeT7znjB"
                + "JXjx4S+ctcScLkaT6IK0WlYTJt/6J24csB38ABESFnkduwvpycnAvR9K2VK1dGqIhhplTjNIU1BN8sa7BjF4C4jEKS0MqcRA++8WagHkQO"
                + "2DSB4qyP79snsJfi6naGGGePhhNdqpSXgAV1mJTYh+9J7ZznJfPS8eI7e6QEJ14vZlmhaAO6gUPApmBlC26la+gQNUOiplrM3VvAOWCups"
                + "qOLcJwvKDAYvNedNZ9s7IhlcOwLgPWr1/fg/YYANeztQIY7KzDJbOwTdPC5/NRdpOgLmGwEgWFjsTCt53SpYe9KE7UNEGzUl4T816UeEmJ"
                + "6IGAOMGqUn0Yiskn5s4tYm1YJ4FHHxf/1ElS+bvfS/XClyXrww/Fe+99UFZrxdqzny6pGtmRAjheWKj4VLF0cwCzddJUyI6s+IpEom6hF5"
                + "bALksO9sZGsklqE1HRTAHMnUV8jz377LNdsCXTGeVIWoYje/e4rKpDmvjhe2DwRonEpoIBgJKVoRzY2MEC1cR57ii8Q3kCUPcNUyTrtTdE"
                + "z82R4BNPSWLJ3yT23LMSnDdfXL16Sebc+eK45AJJrvxS9XW0bqWe8XXr1VO8IB40+nGixFqyubuFxNesddJHwBeuSrEhzCq8InHCIdFA1H"
                + "qAtfQ2KrRbT7X/ZFngUSWoWnT5Cts20ClomJRmRrhaXmUroVVfq30XqQupVo42bcRz8TgFqPfccyT06T8keOMUsPlh0Xr0UTKb/PsKqbnm"
                + "Kont2CmB634jGc/9VRxnDhDDR8cOGignR1HPXP210uhKPlVNgx86JN06SOLvi43o/gPcBbGjKkgYiQcXuQ24l/KriNtQgzkyMjIgTPXJMi"
                + "sqDQbvkn368QrDga5Ha8To1llc424RD9jQM2iQGLC7TJ5u3SR5+WUSXrVKYn+Zo75RYyvHgs4FaKCd0Q4y3kEiTz0hsU/6iufnP5PAwzPF3"
                + "etM1T7rhoniu+gCCX+zSqJr10rstXexz0GYQKy0LuHTsjkvtnGTyzd4UDhlWWIILNrA+WiDDvvAxUrVO0Bq2bRpE8lteL3ejpwJnpUicKy"
                + "42GF9vkwTLL4RO9vKDPPqkrdogbjO6MpuCinR7TskvPwLcWRlSe0bb0ryX58p06RYDxq7PnFGsiP+dFCcSqvukdmSmHYbcNBeEoWHxHfOO"
                + "eJs106cEy4XQa7q0V2CN1yvFKBUw6VNJ1CZw8W3bHVAucH7U8Sk55UJR0TJB9ibTcSxdetWbe3ateR5Pxqwsl5QrVAILgwCJNhTSTRYLAa"
                + "0DpWJ49yhiqKxXbslvGaNRGE7Y/PnqgGyIbMGEGECYAUYg4sTJVIc/jSXibhToitXS83t06S2ez9xXzVBXH372MBDTNSqmyqwFLWt2losr"
                + "PEkMLEw7qKXlpayq+bA3q8G1W3ee++9iMEsajqlnvG0kuGQrc7pWKRZCBXK8WiZKebRo1I29lJJrP1GzaNGHHaWaKu/EWnZAuaE/j1SU7t"
                + "tf238mwYi5dTY2icpoQdnCrVCjQG7PaqfaJ1hLeh0NBxTAekUM1gDgEkvoI7rRRuYJ6p+hSdOSBlWqVOnTm5QmO/pCETMUFjnWAjt7UbpX"
                + "7I8I5ziUknQJFEJ0e9lPAw/VyW18CboTvdv7plakubxillcYiMQAYjO8JMJLJzYuA2mC0hsCCzrCGRea65HAxF0vWVL2yNBFRQX7XMaYE0"
                + "//fTT+WJlZmYSqTZFUWCyYti5QLL3VFhqkIhBmCQYPggP2JXvpFJ6aBVFpV8a9DtJUYP4WFH44WxHpBGJfFJOvUBqU2DZjnj1oF9trWZFY"
                + "00nJRHrv+klJSVsriG6gM8ox/aM8GJkZStMoUF9B3y2E2NbUFnrdQYwWw7T9K2YDAGhmNhYB1dYye+Q2/Q46SdXgWRW1wi2ae0XAMtoymS"
                + "UlZctWnsoXJqhponILSoXLb+Dpefl1usgNsMOK7Vb+ptFpaUAfvLJJ8PY2Yf2EJuNWXC5bHkmholZUpEJOxgWdjmMof3Ef+01Yo0/Iibcv"
                + "8TmzRJb8bVCuHngIGx0JRrTLUz1U51P8GNrVhV1CUJMrtDRuqV4J1wmRuvWYsDxSVRWSui+GTBnMFsN/WpF9SAIlJVEpKbgQXc1KVxmqoD"
                + "6BVBpWdig059++mluqFehMi2wmu712pjh4CRbuhvdubwsuIx7JTjlTnFcer44+vcVZ+fO4hl1tiRLyxActAJ1dqJLLawXOjPiIXs2TVwsO"
                + "EXgg3OyZCQsnv79JAOBiKNTviT2HZBkRblE/rYYXLRDtC7dGwPbcDyvD05H6kOK9XlAhy/HKEw7jMxmJo4yDkGN29TEB2fbNkl9xCic5x3"
                + "UJYuUasBOpDYoLa2yJP76Iom9buNEg9nzPDpDvJ07SWDazRLbfI5E/vi4WoWKiGiC0hqZ5g4Kx9yxCbZ1iPjuuU+8PxkDiraS0L79En7jb"
                + "UkiZmbS8tphRwTxcnPc4rB1r6tXzzjWBLpZ0L8aC2F4kSXsHwwGFSqUVk6dxCdQuRvKK4Ub0cBKCcewofHYyi/dkgvnoDn54WK69VJam8q"
                + "FMpfYvEXCuXkSfuVV8f/manG/+baEv/xSos//RfRWHZQ8UkSsbRvR2xDvPTMQF/eRRHm51L33gbi7dkUE9IJIh662U0J2ZzTV1JcnJFwtE"
                + "Y/kGjyQIknXkt9doG7xgQMHELKJAQdEUVm1TEFv4hRwC7GCxjqiJY5heX4yJqpQ0zQIZy0TB6eWpg8NgMn5jpatJblnr8SXL5Vq+Mihz/4"
                + "p9KczX5grWse2aieDwDqv+o1kvrZI6HcjppXa6bcpQDVsAzmu/LVIQaGNZHpozQHL+bkrWlQq+qjzTHd+PgEmdbl4F45mDlx00UWFvFUA5"
                + "azYkwBbvFqAp3PFihX7gZUClN1YODtprq5dYmhkKQynFQsqmk00KaigPCeLi5UyYBwcXzhfqn8xQZJQOpkz7xPH+WPFc/8D4rtkrIT/uVS"
                + "C8KqSazeJMWyk6m8hTNRzczESjIYyb83OZn+kU1RRJI6zhsXBkYQjvf2k4fxpC95Dffv2tVJiaysovJg8psAVhUKcxZLPsDdjK2tgLW786q"
                + "qk7EBfhoInSlwYPCCjJ7wh2NFEURF2QuCp4pvWvbdoQ8+S2vtnSOiDD6Ul/G//BedL1ZW/kPgrC0UfNEy0ltijwo4IU2L9BmhoOBJ8OQmS"
                + "YbfJY+IZMZwmlfKrepFTy8rKvuK3FAfbFaxFsrD3Q4om0OiffCLb/obHY/qv+nWdav1dAIO6ZuEecY4fqxaa/OwTUdEQRQPxrLnmG/Fcc5"
                + "3kPDxLjNNaqy2cnI+X2Mp/+35EQfBqIRoUiXjBQXEiTmZZpbRWSb+nn+SofYc0x+jzk9hBoR/BNRMOHwi3Y9asWSSeI8XBqpeSYZQs3Loh"
                + "Ozg+/fTT1fF4fC/K9VsmgTGjQ65rro3zcKvZrVMOlZJfDbIc20JOQqKbyR2PDWvFO+N+afHnp8WZ31Fi+/bDbQ1J4KeXSO7KVbT39hYu3F"
                + "OtXRdo5m0M6EU/6xyxEIIeg9weVv2SkvS8akvFf8e0OiMvLwFgoX0UZzrC4fDnuG9yBHt0PD8mElRKAyz8iGDZmDp1ahHuaryHWrhRar8X"
                + "QILK109UN2uO20FMDaRcvy49JfrOh9jNeEX0rnAO6KDAS/I+OEvyEATokM0QQseyLp2lAjKcRPDhHT5Mcr/8RJkl60iFTWkgLTz/VXhw2"
                + "Cwg5ZuaIgLrAz3g3TkuuyIROG8MnQssVjGXG3qoEAR8H98MnI2RkKiyUz3AqY/0DPT333//PXTahbIXQBM7un/kWWH3g7MinETLDFjHLQ"
                + "KNlH0FRaU9XEOwPzWx+/rJknfv3WrXse6TT6VyzGgR7G1H5jwj5RMnSeLwYfH07i3Zz/xJpPwQeAx6gnKbfYItHc7DevA7oci4a3pQ8/v"
                + "V6QO0M4Hzwtq8d+GFF+4kAUFIimc9wFBxxxLOWQWNXDhIq8SuPW4iBC5AbRSsolOJufv2iUW27/KYK5YZ0q697Tk1J1+kAKiiuQOYyZQE5"
                + "Di6dasEJ1whkt8NBh5Rb8d8SSxbKrGyCknCxob/9xMxC2AyDUKC/vVLPLY+VUKdlp1pWZvWaxmLXqvNuGQsOY+amYTxgFD7wMa//eijj4K"
                + "DBw9OLl++nEioT/V6If2F1xsQSDD74Hm9BoM9HHVBLEKdCUd37XKVd++XJ/kdNJ4eMFjAZOnux55cNM+XoKUtbMUy6djZVDabrirZFBt/1"
                + "uaNgM223xpEot4LOzbSsRKR2DLHstat1tyzHo60mPVgJea2latN3QycmtyN3coFIJwbhMPi6t1KNU4zKxVt4cKFbpwxmRs2bBjZp0+fhdj"
                + "YA2TQ3PYhtFm3fLm/asyYbLV1yzi4rpnN+fQyiQycSKjrDTUIXIiIdCLQVDyUR27w43imWeSl2+cgll+/Rslty/nzyvWcLMXKGEVt58BTX"
                + "AKuvOnqq69O4N5mFNQlOzdKDWU4XWEB2DhO/539+/f/Elsjj6GCAJNtuFrdP3p0KHvZ8irZu8OSrdsVpdKdj3sSQFBZEPY1ApYNabvpWx+F"
                + "/eXzRJxCc4i7IhaAdd56W6zFC89V1AMLyoLIAViWHc8///xvMWp0yJAhiaasnF5XcxRmnbrMMm7cODeEnp7Ygzi6mIrvjC3Zh9nEhp376C"
                + "235yQ//4chfQfa7EoqnaoELY8jFsuqqNSkaL/4npkTyr5xcrUKAXlwllJScCErcUFu0sCBA78BK/Mw/zhWTi+pOQqzzoIMkx3om1o4d/o9"
                + "NB/iIeH+EJ1zZt3ds0es1ZuvlrtnPhCFEhHhaZ8fWppsnnLo0f6HJVKZmpraHv6ztelbTcPdg8zFH9fk3HZrVVNgsZTQ3r177wCwX4ErqX"
                + "CVx3WiSU9E4XR7DfccXdOmTSNiPNXV1bMRTV2DMjWjmT5sw8K00Nq1ntoFL/vj815AfInEoxmeFqTDQXpclFmqXz6YCBwzWZtPhossF5bC"
                + "zYQvbrSwvHNmhzN/dmmt0aaNMpkUC3QnG/tA2aN79uy5q3v37ktSt41I2ePkVs2V+sHoJ00a2JqszbYGXM97cJx6C8pcQPreBweB7YnpdS"
                + "tXeuvefc+feHuxw6oosMc3ckXa5dnKiUCR+pRteGcKIdxjLj1sD4dfY8z5pnvc2CgBdXTqxHnYnmNBTStbmwXzs3/nzp3Tcby7AsB6eUMQ"
                + "9TRBaXSieHz6PgCzlw5KO2GnHZ999lmyoKDgV23btn2QB1aog8miTKtrRGyLiN7U4/sPOCJ79rijny9zx7dtc1q792u42qC0Hhulky4eS4"
                + "YPFqNjh6T73HOi7iGDYwzz9BZ5afupMVSFy8h38LoE4DYu++KLLx64+OKLtzWg7EmB5ZzfF2C21XHsyC0hF6gdgYyPwPHFvbj0fTbqyEZh"
                + "yBNtIvbvlGogppk1C/8CkCw9YsQrKw0TZTMWRRvD0uGych/KkZdnGnm4X+ly1PdRFCX36sqhoIPEfXOcix1dhDOwZ/FeQ08qJbN0Or6Tsqj"
                + "/jxIR5EzfqEU5D4H1VJiEtVgMr/ry/iXvXKqrw+pG7LFbtfyu7mPiyfuT9i1b+xu/2/cpG18hLsV33p0uhdJ8E3eyiVzqCF/qCjMR8UOIh"
                + "uY/PHECA86JB2YLqlScvMeM+8w3IyRbisXxkjevE1cil4Ad7UvhuDvN+9PMuC6scvodfewL4zYS0pfEa7DFuhuAvrR9+3a6uNjQEnUpnd4"
                + "gyieyMKj67ySdE6cwTcfEGDZsWGtEJ2MRcD8Ht/QrLJhU5LUnUp+ZN+XJBUQGM9/TdYpDwC3b0PdjODx3Llu2rD/GJVId2KbxQpTUPHj/j"
                + "6n6H3fEpEzsz+vFBi+P8BYB3inPvM3XGqFm5+zs7J6Q8864KdcRpgRhlFI8pBDlDjc0tTAALIYiOoi8E/c6d48ZM+YA6ujkMNpxwA9Ifv"
                + "DBB+lA4EfJ6o8FGGuqTwy0sRWVa8Bk8AqFAihVS+1KFiSgnssuu8xNAFCmKaGjwDIz+1A5OvEfLYK4PImDgiQP+/D9RwGK/iqdSoAbjkn"
                + "brYDHIbuag2fQiGQEi+fC1eJHjx6tdevWTQf1LW60cQD8E5d5qoFML4zP/wbADcdPz0EECM+i+YFHtDBpFoBnWQGKevVEdfrJpqc8/R8Z"
                + "F6/MWQLqvQAAAABJRU5ErkJggg==";

    static final HashMap<String, String> MAP_TO_CONTEXT_DATA_KEYS = createMap();

    static HashMap<String, String> createMap() {
        final HashMap<String, String> map = new HashMap<String, String>();
        map.put(
                EventDataKeys.Identity.ADVERTISING_IDENTIFIER,
                ContextDataKeys.ADVERTISING_IDENTIFIER);
        map.put(EventDataKeys.Lifecycle.APP_ID, ContextDataKeys.APPLICATION_IDENTIFIER);
        map.put(EventDataKeys.Lifecycle.CARRIER_NAME, ContextDataKeys.CARRIER_NAME);
        map.put(EventDataKeys.Lifecycle.CRASH_EVENT, ContextDataKeys.CRASH_EVENT_KEY);
        map.put(
                EventDataKeys.Lifecycle.DAILY_ENGAGED_EVENT,
                ContextDataKeys.DAILY_ENGAGED_EVENT_KEY);
        map.put(EventDataKeys.Lifecycle.DAY_OF_WEEK, ContextDataKeys.DAY_OF_WEEK);
        map.put(
                EventDataKeys.Lifecycle.DAYS_SINCE_FIRST_LAUNCH,
                ContextDataKeys.DAYS_SINCE_FIRST_LAUNCH);
        map.put(
                EventDataKeys.Lifecycle.DAYS_SINCE_LAST_LAUNCH,
                ContextDataKeys.DAYS_SINCE_LAST_LAUNCH);
        map.put(
                EventDataKeys.Lifecycle.DAYS_SINCE_LAST_UPGRADE,
                ContextDataKeys.DAYS_SINCE_LAST_UPGRADE);
        map.put(EventDataKeys.Lifecycle.DEVICE_NAME, ContextDataKeys.DEVICE_NAME);
        map.put(EventDataKeys.Lifecycle.DEVICE_RESOLUTION, ContextDataKeys.DEVICE_RESOLUTION);
        map.put(EventDataKeys.Lifecycle.HOUR_OF_DAY, ContextDataKeys.HOUR_OF_DAY);
        map.put(
                EventDataKeys.Lifecycle.IGNORED_SESSION_LENGTH,
                ContextDataKeys.IGNORED_SESSION_LENGTH);
        map.put(EventDataKeys.Lifecycle.INSTALL_DATE, ContextDataKeys.INSTALL_DATE);
        map.put(EventDataKeys.Lifecycle.INSTALL_EVENT, ContextDataKeys.INSTALL_EVENT_KEY);
        map.put(EventDataKeys.Lifecycle.LAUNCH_EVENT, ContextDataKeys.LAUNCH_EVENT_KEY);
        map.put(EventDataKeys.Lifecycle.LAUNCHES, ContextDataKeys.LAUNCHES);
        map.put(
                EventDataKeys.Lifecycle.LAUNCHES_SINCE_UPGRADE,
                ContextDataKeys.LAUNCHES_SINCE_UPGRADE);
        map.put(EventDataKeys.Lifecycle.LOCALE, ContextDataKeys.LOCALE);
        map.put(
                EventDataKeys.Lifecycle.MONTHLY_ENGAGED_EVENT,
                ContextDataKeys.MONTHLY_ENGAGED_EVENT_KEY);
        map.put(EventDataKeys.Lifecycle.OPERATING_SYSTEM, ContextDataKeys.OPERATING_SYSTEM);
        map.put(
                EventDataKeys.Lifecycle.PREVIOUS_SESSION_LENGTH,
                ContextDataKeys.PREVIOUS_SESSION_LENGTH);
        map.put(EventDataKeys.Lifecycle.RUN_MODE, ContextDataKeys.RUN_MODE);
        map.put(EventDataKeys.Lifecycle.UPGRADE_EVENT, ContextDataKeys.UPGRADE_EVENT_KEY);

        return map;
    }

    // contextdata keys
    static final class ContextDataKeys {
        static final String INSTALL_EVENT_KEY = "a.InstallEvent";
        static final String LAUNCH_EVENT_KEY = "a.LaunchEvent";
        static final String CRASH_EVENT_KEY = "a.CrashEvent";
        static final String UPGRADE_EVENT_KEY = "a.UpgradeEvent";
        static final String DAILY_ENGAGED_EVENT_KEY = "a.DailyEngUserEvent";
        static final String MONTHLY_ENGAGED_EVENT_KEY = "a.MonthlyEngUserEvent";
        static final String INSTALL_DATE = "a.InstallDate";
        static final String LAUNCHES = "a.Launches";
        static final String PREVIOUS_SESSION_LENGTH = "a.PrevSessionLength";
        static final String DAYS_SINCE_FIRST_LAUNCH = "a.DaysSinceFirstUse";
        static final String DAYS_SINCE_LAST_LAUNCH = "a.DaysSinceLastUse";
        static final String HOUR_OF_DAY = "a.HourOfDay";
        static final String DAY_OF_WEEK = "a.DayOfWeek";
        static final String OPERATING_SYSTEM = "a.OSVersion";
        static final String APPLICATION_IDENTIFIER = "a.AppID";
        static final String DAYS_SINCE_LAST_UPGRADE = "a.DaysSinceLastUpgrade";
        static final String LAUNCHES_SINCE_UPGRADE = "a.LaunchesSinceUpgrade";
        static final String ADVERTISING_IDENTIFIER = "a.adid";
        static final String DEVICE_NAME = "a.DeviceName";
        static final String DEVICE_RESOLUTION = "a.Resolution";
        static final String CARRIER_NAME = "a.CarrierName";
        static final String LOCALE = "a.locale";
        static final String RUN_MODE = "a.RunMode";
        static final String IGNORED_SESSION_LENGTH = "a.ignoredSessionLength";

        private ContextDataKeys() {}
    }

    // datastore keys
    static final String DATA_STORE_KEY = "ADOBEMOBILE_TARGET";

    static class DataStoreKeys {
        static final String TNT_ID = "TNT_ID";
        static final String THIRD_PARTY_ID = "THIRD_PARTY_ID";
        static final String SESSION_ID = "SESSION_ID";
        static final String SESSION_TIMESTAMP = "SESSION_TIMESTAMP";
        static final String EDGE_HOST = "EDGE_HOST";

        private DataStoreKeys() {}
    }

    static final int DEFAULT_NETWORK_TIMEOUT = 2;
    static final int DEFAULT_TARGET_SESSION_TIMEOUT_SEC = 30 * 60; // 30 mins

    private TargetTestConstants() {}

    static final class Events {
        static final String TARGET_VIEW_PREFETCH = "TargetViewPrefetchRequest";
        static final String TARGET_PREVIEW_LIFECYCLE = "TargetPreviewLifecycle";
        static final String TARGET_RAW_REQUEST = "TargetRawRequest";
        static final String TARGET_RAW_NOTIFICATIONS = "TargetRawNotifications";

        private Events() {}
    }

    static final class EventDataKeys {

        private EventDataKeys() {}

        static final class Analytics {
            static final String TRACK_INTERNAL = "trackinternal";
            static final String TRACK_ACTION = "action";
            static final String CONTEXT_DATA = "contextdata";

            private Analytics() {}
        }

        static final class Audience {
            static final String EXTENSION_NAME = "com.adobe.module.audience";
            static final String DPID = "dpid";
            static final String DPUUID = "dpuuid";
            static final String UUID = "uuid";

            private Audience() {}
        }

        static final class Configuration {
            static final String EXTENSION_NAME = "com.adobe.module.configuration";
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            static final String TARGET_CLIENT_CODE = "target.clientCode";
            static final String TARGET_NETWORK_TIMEOUT = "target.timeout";
            static final String TARGET_ENVIRONMENT_ID = "target.environmentId";
            static final String TARGET_SERVER = "target.server";

            private Configuration() {}
        }

        static final class Identity {
            static final String EXTENSION_NAME = "com.adobe.module.identity";
            static final String VISITOR_ID_MID = "mid";
            static final String VISITOR_ID_BLOB = "blob";
            static final String VISITOR_ID_LOCATION_HINT = "locationhint";
            static final String VISITOR_IDS_LIST = "visitoridslist";
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";

            private Identity() {}
        }

        static final class Lifecycle {
            static final String EXTENSION_NAME = "com.adobe.module.lifecycle";

            static final String APP_ID = "appid";
            static final String CARRIER_NAME = "carriername";
            static final String CRASH_EVENT = "crashevent";
            static final String DAILY_ENGAGED_EVENT = "dailyenguserevent";
            static final String DAY_OF_WEEK = "dayofweek";
            static final String DAYS_SINCE_FIRST_LAUNCH = "dayssincefirstuse";
            static final String DAYS_SINCE_LAST_LAUNCH = "dayssincelastuse";
            static final String DAYS_SINCE_LAST_UPGRADE = "dayssincelastupgrade";
            static final String DEVICE_NAME = "devicename";
            static final String DEVICE_RESOLUTION = "resolution";
            static final String HOUR_OF_DAY = "hourofday";
            static final String IGNORED_SESSION_LENGTH = "ignoredsessionlength";
            static final String INSTALL_DATE = "installdate";
            static final String INSTALL_EVENT = "installevent";
            static final String LAUNCH_EVENT = "launchevent";
            static final String LAUNCHES = "launches";
            static final String LAUNCHES_SINCE_UPGRADE = "launchessinceupgrade";
            static final String LIFECYCLE_CONTEXT_DATA = "lifecyclecontextdata";
            static final String LOCALE = "locale";
            static final String MONTHLY_ENGAGED_EVENT = "monthlyenguserevent";
            static final String OPERATING_SYSTEM = "osversion";
            static final String PREVIOUS_SESSION_LENGTH = "prevsessionlength";
            static final String RUN_MODE = "runmode";
            static final String UPGRADE_EVENT = "upgradeevent";

            private Lifecycle() {}
        }

        static final String EXTENSION_NAME = "com.adobe.module.target";

        static final String MBOX_NAME = "mboxname";
        static final String MBOX_NAMES = "mboxnames";
        static final String TNT_ID = "tntid";
        static final String THIRD_PARTY_ID = "thirdpartyid";
        static final String SESSION_ID = "sessionid";
        static final String LOAD_REQUESTS = "request";
        static final String TARGET_CONTENT = "content";
        static final String PREFETCH_REQUESTS = "prefetch";
        static final String PREFETCH_ERROR = "prefetcherror";
        static final String PREFETCH_RESULT = "prefetchresult";
        static final String PREFETCH_VIEWS = "prefetchviews";
        static final String PREFETCH_CACHE_ONLY = "cacheonly";
        static final String RESET_EXPERIENCE = "resetexperience";
        static final String CLEAR_PREFETCH_CACHE = "clearcache";
        static final String PROFILE_PARAMETERS = "profileparams";
        static final String MBOX_PARAMETERS = "mboxparameters";
        static final String ORDER_PARAMETERS = "orderparameters";
        static final String PRODUCT_PARAMETERS = "productparameters";
        static final String PREVIEW_RESTART_DEEP_LINK = "restartdeeplink";
        static final String IS_LOCATION_CLICKED = "islocationclicked";
        static final String IS_LOCATION_DISPLAYED = "islocationdisplayed";
        static final String LOCATION_CLICKED = "TargetLocationClicked";
        static final String LOCATIONS_DISPLAYED = "TargetLocationsDisplayed";
        static final String TARGET_VIEW_NOTIFICATION = "TargetViewNotificationRequest";
        static final String TARGET_VIEW_PREFETCH = "TargetViewPrefetchRequest";
        static final String DEFAULT_CONTENT = "defaultcontent";
        static final String BASE_CLASS = "baseclass";
        static final String RESPONSE_PAIR_ID = "responsepairid";
        static final String TARGET_PARAMETERS = "targetparams";
        static final String VIEW_NOTIFICATIONS = "viewnotifications";
        static final String PROPERTY_TOKEN = "propertytoken";
        static final String PREVIEW_INITIATED = "ispreviewinitiated";
        static final String A4T_SESSION_ID = "a.target.sessionId"; // For A4T requests event data.
        static final String ANALYTICS_PAYLOAD = "analytics.payload";
        static final String RESPONSE_TOKENS = "responseTokens";
        static final String CLICK_METRIC_ANALYTICS_PAYLOAD = "clickmetric.analytics.payload";
        static final String IS_RAW_EVENT = "israwevent";
        static final String NOTIFICATION = "notification";
        static final String RESPONSE_DATA = "responsedata";
    }
}
