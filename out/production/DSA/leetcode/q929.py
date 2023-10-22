emails = [
    "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"
]
local_names = []
domains = []

for email in emails:
    at_the_rate = int(email.index("@"))
    domain = ""

    for ch in range(at_the_rate, len(email)):
        domain += email[ch]
        pass

    domains.append(domain)

print(domains)

for email in emails:
    local_name = ""
    for ch in email:
        if ch == "+" or ch == "@":
            break
        if ch == ".":
            pass
        else:
            local_name += ch
    local_names.append(local_name)

print(local_names)

new_emails = []

for i in range(len(emails)):
    new_email = local_names[i] + domains[i]
    new_emails.append(new_email)

print(new_emails)

unique_emails = []

for email in new_emails:
    if email not in unique_emails:
        unique_emails.append(email)
    else:
        pass

print(unique_emails)
