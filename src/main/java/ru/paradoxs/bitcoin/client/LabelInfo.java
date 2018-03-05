package ru.paradoxs.bitcoin.client;

import java.math.BigDecimal;

public class LabelInfo {
    private String label = "";
    private BigDecimal amount = BigDecimal.ZERO;
    private long confirmations = 0;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(long confirmations) {
        this.confirmations = confirmations;
    }

    @Override
    public String toString() {
        return "LabelInfo{" +
                "label='" + label + '\'' +
                ", amount=" + amount +
                ", confirmations=" + confirmations +
                '}';
    }
}
