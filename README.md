# shop
در این پروژه قصد داریم ی ک فروشگاه نرم افزاری)مانند اپ استور و یا گوگل پلی( را پیاده سازی کنیم. در این فرو شکاه، توسعه دهندگان یا همانdeveloper ها م ی توانند اپلیکیشن های خود را قرار دهند و کاربران یا همانuser ها می توانند آن ها را خریداری و دریافت کنن د. موجودیت های اصلی • کاربر )دارای اطلاعات هم چون نام کامل، نام کاربری، رمز ورود، موجودی کیف پول و لیست اپلیکیشن هایی که دانلود کرده است(
• توسعه دهنده )دارای اطلاعات هم چون نام کامل، نام کاربری، رمز ورود، شماره حساب و لیست اپلیکشن هایی که متعلق به او است(. ورود شماره حساب اختیاری است، اما توسعه دهنده ای که شماره حساب ثبت شده در سیستم نداشته باشد، حق قراردادن اپلیکیشن را ندارد. • اپلیکیشن )دارای اطلاعات هم چون نام، توضیحات، قیمت به دلار با دقت دو رقم اعشار، تعداد دانلود واطلاعات توسعه دهنده( کارکرد برنام ه
منوی خوش آمدگو ی
پس از باز شدن برنامه، برنامه وارد م نوی خوش آمدگویی میشود. در این منو، ابتدا عبارت Welcome to the application! نمایش داده میشود و سپس در خط بعد، کاربر میتواند ی از موار دsignup برای ورود به صفحه ی ثبت نام،login برای ورود به صفحه ی ورود به برنامه یاexit برای خروج از برنامه را وارد کند.
منوی ثبت نام
در این منو، ابتدا عبارت Enter user if you want to sign up as a user, and developer if you want to sign up as a developer: نوشته میشود و برنامه به خط بعد میرود. اگ رuser وارد شده بود، بدون چاپ پیام اضاف توسط برنامه، در خطوطبعدی و در هر خط به ترتیب نام کامل، نام کاربری و رمز ورود گرفته م شود. اگر پس از ورود نام کاربری، این نام قبلا در سیستم موجود بود، عبار ت Username exists :(چاپ میشود و برنامه به خط بعد رفته و به منوی خو ش آمدگویی برم گردد )نام کاربری میان تمام اعضا چه توسع ه دهند ه و چ ه کارب ر عاد ی یکتا است(. اگر ثبت نام موفقیتآمیز بود، پیام
Signup successful! نوشته شده و برنامه به خط بعد رفته و به منوی خوش آمدگویی برم گردد.
ثبت نام توسعه دهنده نیز کاملا مشابه است .شماره حساب در این مرحله از توسعه دهنده گرفته نمیشود.
منوی ورو د
در این بخش، کاربر برنامه ابتدا نام کاربری خود را وارد م کند )بدون چاپ پیام از طرف سامانه( و به خ ط بعد میرود.
اگر نام کاربری در سیستم وجود نداشت، لازم است خطا ی Username does not exist :( چاپ شده و برنامه به منوی خوش آمدگویی برگردد؛ در غیر این صورت، کاربر م تواند رمز عبور را در خط بع د واردکند. اگر رمز عبور غلط بود، لازم است خطا ی Wrong password :( چاپ شده و برنامه به منوی خوش آمدگویی برگردد؛ در غیر این صورت، بسته به این که نام کاربری وارد شده مربوط به کاربری عادی بوده است یا توسعه دهنده، برنامه به پنل مربوطه میرود.
پنل توسعه دهنده
در این پنل، ابتدا پیا م Welcome, NAME! چاپ میشود و برنامه به خط بعد میرود، که در آن به جا یNAME نام کامل توسعه دهنده قرار میگیرد. سپس توسعه دهنده میتواند یکی از دستورات زیر را وارد کند: • با وارد کردنlogout و رفتن به خط بعد، برنامه به منوی خوش آمدگویی برم گردد.
• با وارد کردنaccount و رفتن به خط بعد، برنامه در ی خط، عددی ۶١ رقم بدون خط ‐ در میان آ ن رابه عنوا ن شماره حساب توسعه دهنده را دریافت م کن د. سپس، برنام ه ب ه پنل توسع ه دهنده برم گردد. فرمت شماره ورودی را نیز چک میکند. • با وارد کردنapps و رفتن به خط بعد، برنامه وارد لیست اپلیکیشن ها میشود که در ادامه شرح داده شده است. در صورت ورود هر گونه دستور دی گری، خطا ی Invalid command! نمایش داده میشود.)چه در این منو و چه در منوهای دی گر(
پنل کاربر عادی
در این پنل ،ابتدا پیا م Welcome, NAME! چاپ میشود و برنامه به خط بعد میرود، که در آن به جا یNAME نام کامل کاربر قرار م گیرد. سپس کارب ر میتواند یک ی از دستورات زیر را وارد کند:
• با وارد کردنlogout و رفتن به خط بعد، برنامه به منوی خوش آمدگویی برم گردد.
• با وارد کردنapps و رفتن به خط بعد، برنامه وارد لیست اپلی یشن ها م شود که در ادامه شرح داده شده است. • با وارد کرد نdownloads و رفتن به خط بعد، برنامه وارد لیست اپلی یشن های دانلود شد ه توسط این کاربر م شود که در ادامه شرح داده شده است.
• با وارد کرد نbalance و رفتن به خط بعد، برنامه در ی خط، موجودی کیف پول کاربر را به دلار تا دو رقماعشار چاپ کرده و به خط بعد رفته و به منوی پنل کاربر عادی برمیگردد.
• با وارد کرد نdeposit و رفتن به خط بعد، برنامه در یک خط، عددی تا دو رقم اعشار گرفته و موجودی کیف پول را به این میزان زیاد کرده و به خط بعد رفته و به منوی پنل کاربر عادی برم گردد.
تضمین م شود که اعداد وارد شده در این بخش، مثبت و تا دو رقم اعشار خواهند بود.
در صورت ورود هر گو نه دستور دی گری، خطای زیر نمایش داده میشود.
Invalid command!
لیست اپلیکیشن ها
در این صفحه، ابتدا عبار ت Apps: در ی ک خط نمایش داده شده و در خطوط بعدی به ترتیب، نام اپلیکیشن ها نمایش داده میشوند. اگر این لیست ازپنل توسعه دهنده باز شده باشد، تنها شامل اپلیکیشن هایی خواهد بود که توسعه دهنده آن ها را در سامانه در ج کردهاست. اگر این لیست توسط دستورapps از پنل کاربر عادی باز شده باشد، شامل تمام اپلیکیشن های سامانه است . اگر این لیست توسط دستو رdownloads از پنل کاربر عادی باز شده باشد، شامل اپلیکیشن هایی است که کاربردانلودکرده است. اگر اپل یکیشن با شرایط خواسته شده موجود نباشد، به جا ی Apps: و سپس لیست اپلی یشن ها، عبارت No apps! در یخط نمایش داده م شود. لیست اپلی یشن ها در هر روش، همواره به ترتیب الفبایی نمایش داده م شود.
در خط بعد، م توان ی از دستورات زیر را وارد کرد )تضمین م شود که اپلی یشن با نام برابر ی از این دستوراتد ر سامانه اضافه نخواهد شد(:
• با وارد کرد نback و رفتن به خط بعد، برنامه به پنلی میرود که لیست از آن جا صدا زده شده است. • با وارد کردنcreate و رفتن به خط بعد، تنها در صورت که ورود از جانب پنل توسعه دهنده باشد، در خطوط بعدی و در هر خط به ترتیب نام اپلیکیشن جدید، توضیحات اپلی یشن و قیمت آن به دلار تا دو رقم اعشار، بدون چاپ پیام اضافه ای از جانب اپلیکیشن، وارد مشود. در صورت افزودن موفقیت آمیز، عبار ت App added! نمایش داده شده و برنامه به منوی لیست اپلیکیشن ها بر میگردد. اگر توسعه دهنده شماره حساب خود ر ا واردنکرده باشد و اقدام به ثبت اپلیکیشن نماید، خطا ی No account number :( نمایش داده شده و برنامه به منوی لیست اپلیکیشن ها بر میگردد. اگر دستورcreate از طرف کاربر عادی
فراخوان شود، خطا یInvalid command! نمایش داده میشود.
• با وارد کردن نام یک ی از اپلی کیشن های موجود در لیست و رفتن به خط بعد، برنامه وارد صفحه ی آن اپلیکیشن میشود که در ادامه شرح داده شده است. در صورت ورود هر گونه دستور دی گری، خطا ی Invalid command! نمایش داده میشود.
صفحه ی هر اپلیکیشن
در این صفحه، ابتدا نام اپلیکیشن در ی کخط نمایش داده شده و در خط بعدی، توضیحات آن نوشته میشود.
در خط بعد، عبارت Price: X نمایش داده میشود که در آ نX قیمت اپلیکیشن به دلار تا دو رقم اعشار است. در خط بعد، اگر اکانت کنو ن مربوط به توسعه دهنده باشد و اپلیکیشن کنون نیز متعلق به همان توسعه دهنده باشد، عبارت Downloads: X نمایش داده میشود که در آ نX برابر تعداد کاربران است که اپلیکیشن کنون را دانلود کرده اند؛ اما اگر اکانت کنو ن مربوط به کاربر عادی باشد، عبارت Developer: X نمایش داده میشود که در آ نX نام کامل توسعه دهنده ی اپلیکیشن کنون است. در خط بعد از نمایش اطلاعات فوق، میتوان یک یاز دستورات زیر را وارد کرد:
• با وارد کرد نback و رفتن به خط بعد، برنامه به منویی میرود که صفحه از آن جا باز شده است. • با وارد کرد نdownload و رفتن به خط بعد، اگر کاربر کنون توسعه دهنده باشد و یا قبلا اپلیکیشن را دانلودکرده باشد، خطا ی Invalid command! نمایش داده شده میشود. در غیر این صورت، اگر موجودی کیف پول کاربر برای خرید اپلیکیشن کافی نباشد،خطای Not enough balance :( چاپ میشود. در صورت برقرار نبودن هیچ یک از موقعیت های خطای فوق، به میزان قیمت اپلیکیشن ازموجودی کیف پول کاربر کم شده، اپلیکیشن به لیست اپلیکیشن های دانلود شده توسط این کاربر اضافه شد ه و پیا م Downloaded! نمایش داده میشود. پس از نمایش هر پیام توسط برنامه، برنامه به خط بعد میرود.
در صورت ورود هر گونه دستور دی گری، خطا ی Invalid command! نمایش داده میشود.
این پروژه براساس MVC ایجاد شده است که شامل view/model/controller است. model نمایش داده‌هایی است که به کنترلر ارسال می‌شود، داده‌هایی که روی یک View کار می‌کنند مدل حاوی اطلاعات اصلی برنامه است view برای نمایش نتیجه کار به کاربر است controller برای انجام درخواست های کاربر است.

