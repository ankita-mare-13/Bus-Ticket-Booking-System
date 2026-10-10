# 🚌 Yatra - Bus Ticket Booking Engine

A real-time seat management system built in Core Java.

**Why this is different?**
- Live inventory: 40 seats -> Book 2 -> shows 38, Cancel 1 -> auto restores to 39
- Timestamp-based Ticket ID (T+millis) like real RedBus/IRCTC
- HashMap for O(1) ticket search - instant result even for 10k tickets

**Tech Stack:** Java, OOPs, ArrayList (Bus DB), HashMap (Ticket Store)
**Run:** `javac *.java && java Main`

**Architecture:** Bus (Model) -> Ticket (Transaction) -> Main (Controller)

Built for learning System Design.
