Feature: Cake

  Scenario: Use of 'a' and 'by' in When construction

    Given no previous events
    When you send a Cake by post
    Then cake sent

  Scenario: Use of 'a' and 'with' in When construction

    Given no previous events
    When you markAsFailed a Cake by failed details
    Then cake failed