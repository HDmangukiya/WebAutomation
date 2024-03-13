package kiwisaver.pages;

public class KiwiSaverCalculatorIFrame {

  public static final String current_age_field = "//input[@id='text-QUESTION_AGE']";

  public static final String current_age_NextQuestion =
      "(//span[@class='MuiButton-label' and contains(text(), 'Next Question')])[1]";

  public static final String income_NextQuestion =
      "(//span[@class='MuiButton-label' and contains(text(), 'Next Question')])[2]";

  public static final String kiwisaver_NextQuestion =
      "(//span[@class='MuiButton-label' and contains(text(), 'Next Question')])[3]";
  public static final String help_alert =
      "//span[@class='MuiButton-label' and contains(text(), 'Ok, I understand')]\n";

  public static final String first_home =
      "//span[@class='sc-iNqMTl hFrbFX' and text()='First Home']\n";

  public static final String dropdown_expected_years =
      "//div[contains(@class, 'MuiSelect-root') and contains(@class, 'MuiSelect-select') and contains(@class, 'MuiSelect-selectMenu') and contains(@class, 'MuiInputBase-input') and contains(@class, 'MuiInput-input') and text()='Choose option']\n";

  public static final String dropdown_selection_2years =
      "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiListItem-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiListItem-button') and contains(text(), 'In 2 years')]\n";

  public static final String dropdown_employment_status =
      "//div[contains(@class, 'MuiSelect-root') and contains(@class, 'MuiSelect-select') and contains(@class, 'MuiSelect-selectMenu') and contains(@class, 'MuiInputBase-input') and contains(@class, 'MuiInput-input') and @aria-labelledby='dropdown-QUESTION_EMPLOYMENT_STATUS']";

  public static final String dropdown_selection_employed =
      "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiListItem-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiListItem-button') and contains(text(), 'Employed')]\n";

  public static final String dropdown_income_per_year =
      "//div[contains(@class, 'MuiSelect-root') and contains(@class, 'MuiSelect-select') and contains(@class, 'MuiSelect-selectMenu') and contains(@class, 'MuiInputBase-input') and contains(@class, 'MuiInput-input') and @aria-labelledby='dropdown-QUESTION_INCOME']";

  public static final String dropdown_contribution_rate =
      "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input' and text()='Choose option']";

  public static final String dropdown_type_fund =
      "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input' and text()='Choose fund']\n";

  public static final String type_fund =
      "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root sc-ehSCib iuvPuI MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button' and @data-value=\"I’m not sure which fund\"]\n";
  public static final String contribution_rate =
      "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root sc-ehSCib iuvPuI MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button' and text()='3%']\n";

  public static final String current_income = "//input[@id='text-QUESTION_INCOME']";

  public static final String estimated_balance =
      "//p[@class='MuiTypography-root sc-bWNSNh ijsSky MuiTypography-h6' and contains(text(), 'Your estimated balance at age')]\n";
  public static final String kiwi_saver_balance =
      "//input[@id='text-QUESTION_KIWISAVER_BALANCE']\n";

  public static final String current_projection =
      "//div[contains(@class, 'MuiGrid-root') and contains(@class, 'sc-hKKeuH') and contains(@class, 'kXQUbk') and contains(@class, 'MuiGrid-item') and contains(@class, 'MuiGrid-grid-xs-12') and contains(@class, 'MuiGrid-grid-lg-7')]\n";
}
